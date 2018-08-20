package com.invesmart.invesmartUI.controller;

import com.invesmart.invesmartCommons.dto.user.LoginCredentialsDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/info")
    ResponseEntity<String> info() {
        return ResponseEntity.ok("Hola");
    }

    @PostMapping("/login")
    ResponseEntity<String> login(@RequestBody LoginCredentialsDTO loginCredentialsDTO) {
        return ResponseEntity.ok("User: "+loginCredentialsDTO.getUsername()+"Password"+loginCredentialsDTO.getPassword());

        /*this.validateUser(userId);

        return this.accountRepository
                .findByUsername(userId)
                .map(account -> {
                    Bookmark result = this.bookmarkRepository.save(new Bookmark(account,
                            input.getUri(), input.getDescription()));

                    URI location = ServletUriComponentsBuilder
                            .fromCurrentRequest()
                            .path("/{id}")
                            .buildAndExpand(result.getId())
                            .toUri();

                    return ResponseEntity.created(location).build();
                })
                .orElse(ResponseEntity.noContent().build());*/
    }

    /*@RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<String> login(@RequestBody LoginCredentials credentials, HttpServletResponse response, HttpServletRequest request) throws Exception{
        logger.debug(LogMessagesFormatter.formatMethodInput(Thread.currentThread().getStackTrace()[1].getMethodName(),null));
        String URL = URLFormatUtils.getURLForPostMethod("/login", this.urlCosmosCentre);
        credentials.setIp(request.getRemoteAddr());
        LogInInfoFrontToBackDTO logInInfoFrontToBackDTO = new LogInInfoFrontToBackDTO (credentials, request.getRemoteAddr());
        ResponseEntity<String> executionResponse = dataHandler.executePOSTMethodAndReturnData(URL, LogInInfoBackToFrontDTO.class, logInInfoFrontToBackDTO,null);
        ObjectMapper mapper = new ObjectMapper();
        try {
            LogInInfoBackToFrontDTO logInInfoBackToFrontDTO = mapper.readValue(executionResponse.getBody(), LogInInfoBackToFrontDTO.class);
            credentials.setSessionID(logInInfoBackToFrontDTO.getMinimalProfile().getSessionID());
            credentials.setIdCanal(CANAL_WEB);
            Object profile = getMinimalProfile(response, credentials, logInInfoBackToFrontDTO.getMinimalProfile());
            logger.debug(LogMessagesFormatter.formatMethodOutput(Thread.currentThread().getStackTrace()[1].getMethodName()));
            return ResponseEntity.ok(mapper.writeValueAsString(profile));
        } catch (UnrecognizedPropertyException e){
            ResponseDTO responseDTO = mapper.readValue(executionResponse.getBody(), ResponseDTO.class);
            logger.debug(LogMessagesFormatter.formatMethodOutput(Thread.currentThread().getStackTrace()[1].getMethodName()));
            return executionResponse;
        }
    }*/

}
