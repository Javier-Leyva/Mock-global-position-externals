package io.swagger.api;

import io.swagger.model.Errors;
import io.swagger.model.GlobalPositionView;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-05-28T11:35:28.994Z")

@Controller
public class ViewApiController implements ViewApi {

    private static final Logger log = LoggerFactory.getLogger(ViewApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ViewApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GlobalPositionView> meContractNewAliasGetV3(@ApiParam(value = "Field to send the access token to the API, initially OAuth and JWT." ,required=true) @RequestHeader(value="authorization", required=true) String authorization,@ApiParam(value = "The server responds with the field in the header with the response language. Following the ([ISO 639-2]-[ISO 3166-1/Alpha3]) code standard." ,required=true) @RequestHeader(value="language", required=true) String language,@ApiParam(value = "CHANNEL/SEGMENT FRONT_APP/VERSION DEVICE OS/OS_VERSION NETWORK_CLIENT/VERSION FRAMEWORK/VERSION Channel: [ISO 639-2][] plus 5 custom contry digits. For Segment: retail / business Front_App/Version: For example OneApp/1.0 Device: Platform value extracted from the device. For example iPhone13 OS/VERSION: android / iOS / windows / linux / macOS, version is a platform value extracted from the device. For example iOS/1.0 Network_Client/Version: App network client and version. For example CF_Network/5.1 Framework/Version: For example Darwin/16.3.0" ,required=true) @RequestHeader(value="device-information", required=true) String deviceInformation,@ApiParam(value = "The consumer application identifier for APIs. santander-client-id must be defined just as a Request header, this is not a header defined as an API Key at security definition level" ,required=true) @RequestHeader(value="santander-client-id", required=true) String santanderClientId,@ApiParam(value = "Customer unique identifier.",required=true) @PathVariable("customer_id") String customerId,@NotNull @ApiParam(value = "Unique bank ID", required = true) @Valid @RequestParam(value = "bank_id", required = true) String bankId,@ApiParam(value = "The consumer list of languages by order of preference. Following the (([ISO 639-2]-[ISO 3166-1/Alpha3])) code standard." ) @RequestHeader(value="accept-language", required=false) String acceptLanguage,@ApiParam(value = "The server responds with the data format of the response. Backend expected a JSON document format." ) @RequestHeader(value="content-type", required=false) String contentType,@ApiParam(value = "The consumer request the data format of the response by order of preference.Backend expected a JSON document format." ) @RequestHeader(value="accept", required=false) String accept,@ApiParam(value = "The consumer application identifier (only for IBM API Connect). Legacy. Will be reviewed in future releases." ) @RequestHeader(value="x-ibm-client-id", required=false) String xIbmClientId,@ApiParam(value = "The TraceId is 64 or 128-bit in length and indicates the overall ID of the trace. Every span in a trace shares this ID" ) @RequestHeader(value="x-b3-traceid", required=false) String xB3Traceid,@ApiParam(value = "The ParentSpanId is 64-bit in length and indicates the position of the parent operation in the trace tree. When the span is the root of the trace tree, there is no ParentSpanId." ) @RequestHeader(value="x-b3-parentspanid", required=false) String xB3Parentspanid,@ApiParam(value = "The SpanId is 64-bit in length and indicates the position of the current operation in the trace tree. The value should not be interpreted. It may or may not be derived from the value of the TraceId" ) @RequestHeader(value="x-b3-spanid", required=false) String xB3Spanid,@ApiParam(value = "Sampling is a mechanism to reduce the volume of data that ends up in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value should be consistently sent downstream. This means you will see all spans sharing a trace ID or none. Accepted values are\\n * 1. Means accepted\\n * 0. Means denied Before this specification was written, some tracers propagated X-B3-Sampled as true or false as opposed to 1 or 0. While you shouldn't encode x-b3-sampled as true or false, a lenient implementation may accept them" ) @RequestHeader(value="x-b3-sampled", required=false) String xB3Sampled,@ApiParam(value = "Extra information coming from the client. Needed for audit purposes" ) @RequestHeader(value="x-santander-audit", required=false) String xSantanderAudit,@ApiParam(value = "Device information permitted by operation for data query. Makes it possible to apply an experience base to optimize the data collection. This header is mandatory for Poland due to security reasons" ) @RequestHeader(value="trusted-device-app-id", required=false) String trustedDeviceAppId,@ApiParam(value = "Indicates what kind of cipher algorithmic approach will be applied to a response fields subset. Supported values: * asymmetric" ) @RequestHeader(value="santander-cipher-type", required=false) String santanderCipherType,@ApiParam(value = "Seed value applied on both sides to encrypt/decrypt response entity fields. This field is mandatory if Santander-Cipher-Type is presented and is asymetric in the request Headers collection." ) @RequestHeader(value="santander-cipher-seed", required=false) String santanderCipherSeed,@ApiParam(value = "Device time formatted presenting the following the Standard Time Format pattern yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" ) @RequestHeader(value="trusted-device-time", required=false) String trustedDeviceTime,@ApiParam(value = "Contains encripted parameters from the trusted device parameter source." ) @RequestHeader(value="trusted-device-params", required=false) String trustedDeviceParams) {
        //String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GlobalPositionView>(objectMapper.readValue("{\"empty\": false}", GlobalPositionView.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GlobalPositionView>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GlobalPositionView>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GlobalPositionView> meContractNewAliasPutV3(@ApiParam(value = "Field to send the access token to the API, initially OAuth and JWT." ,required=true) @RequestHeader(value="authorization", required=true) String authorization,@ApiParam(value = "The server responds with the field in the header with the response language. Following the ([ISO 639-2]-[ISO 3166-1/Alpha3]) code standard." ,required=true) @RequestHeader(value="language", required=true) String language,@ApiParam(value = "CHANNEL/SEGMENT FRONT_APP/VERSION DEVICE OS/OS_VERSION NETWORK_CLIENT/VERSION FRAMEWORK/VERSION Channel: [ISO 639-2][] plus 5 custom contry digits. For Segment: retail / business Front_App/Version: For example OneApp/1.0 Device: Platform value extracted from the device. For example iPhone13 OS/VERSION: android / iOS / windows / linux / macOS, version is a platform value extracted from the device. For example iOS/1.0 Network_Client/Version: App network client and version. For example CF_Network/5.1 Framework/Version: For example Darwin/16.3.0" ,required=true) @RequestHeader(value="device-information", required=true) String deviceInformation,@ApiParam(value = "The consumer application identifier for APIs. santander-client-id must be defined just as a Request header, this is not a header defined as an API Key at security definition level" ,required=true) @RequestHeader(value="santander-client-id", required=true) String santanderClientId,@ApiParam(value = "contractsView" ,required=true )  @Valid @RequestBody GlobalPositionView body,@ApiParam(value = "Customer unique identifier.",required=true) @PathVariable("customer_id") String customerId,@NotNull @ApiParam(value = "Unique bank ID", required = true) @Valid @RequestParam(value = "bank_id", required = true) String bankId,@ApiParam(value = "The consumer list of languages by order of preference. Following the (([ISO 639-2]-[ISO 3166-1/Alpha3])) code standard." ) @RequestHeader(value="accept-language", required=false) String acceptLanguage,@ApiParam(value = "The server responds with the data format of the response. Backend expected a JSON document format." ) @RequestHeader(value="content-type", required=false) String contentType,@ApiParam(value = "The consumer request the data format of the response by order of preference.Backend expected a JSON document format." ) @RequestHeader(value="accept", required=false) String accept,@ApiParam(value = "The consumer application identifier (only for IBM API Connect). Legacy. Will be reviewed in future releases." ) @RequestHeader(value="x-ibm-client-id", required=false) String xIbmClientId,@ApiParam(value = "The TraceId is 64 or 128-bit in length and indicates the overall ID of the trace. Every span in a trace shares this ID" ) @RequestHeader(value="x-b3-traceid", required=false) String xB3Traceid,@ApiParam(value = "The ParentSpanId is 64-bit in length and indicates the position of the parent operation in the trace tree. When the span is the root of the trace tree, there is no ParentSpanId." ) @RequestHeader(value="x-b3-parentspanid", required=false) String xB3Parentspanid,@ApiParam(value = "The SpanId is 64-bit in length and indicates the position of the current operation in the trace tree. The value should not be interpreted. It may or may not be derived from the value of the TraceId" ) @RequestHeader(value="x-b3-spanid", required=false) String xB3Spanid,@ApiParam(value = "Sampling is a mechanism to reduce the volume of data that ends up in the tracing system. In B3, sampling applies consistently per-trace: once the sampling decision is made, the same value should be consistently sent downstream. This means you will see all spans sharing a trace ID or none. Accepted values are\\n * 1. Means accepted\\n * 0. Means denied Before this specification was written, some tracers propagated X-B3-Sampled as true or false as opposed to 1 or 0. While you shouldn't encode x-b3-sampled as true or false, a lenient implementation may accept them" ) @RequestHeader(value="x-b3-sampled", required=false) String xB3Sampled,@ApiParam(value = "Extra information coming from the client. Needed for audit purposes" ) @RequestHeader(value="x-santander-audit", required=false) String xSantanderAudit,@ApiParam(value = "Device information permitted by operation for data query. Makes it possible to apply an experience base to optimize the data collection. This header is mandatory for Poland due to security reasons" ) @RequestHeader(value="trusted-device-app-id", required=false) String trustedDeviceAppId,@ApiParam(value = "Indicates what kind of cipher algorithmic approach will be applied to a response fields subset. Supported values: * asymmetric" ) @RequestHeader(value="santander-cipher-type", required=false) String santanderCipherType,@ApiParam(value = "Seed value applied on both sides to encrypt/decrypt response entity fields. This field is mandatory if Santander-Cipher-Type is presented and is asymetric in the request Headers collection." ) @RequestHeader(value="santander-cipher-seed", required=false) String santanderCipherSeed,@ApiParam(value = "Device time formatted presenting the following the Standard Time Format pattern yyyy-MM-dd'T'HH:mm:ss.SSS'Z'" ) @RequestHeader(value="trusted-device-time", required=false) String trustedDeviceTime,@ApiParam(value = "Contains encripted parameters from the trusted device parameter source." ) @RequestHeader(value="trusted-device-params", required=false) String trustedDeviceParams) {
        //String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GlobalPositionView>(objectMapper.readValue("{\"empty\": false}", GlobalPositionView.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GlobalPositionView>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GlobalPositionView>(HttpStatus.NOT_IMPLEMENTED);
    }

}
