package а.а.а.а.а.з;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardParamContext;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent;
import com.alibaba.wireless.security.open.securesignature.SecureSignatureDefine;
import com.alibaba.wireless.security.open.staticdataencrypt.IStaticDataEncryptComponent;
import java.util.HashMap;
import java.util.Map;
import tb.cdw;

/* renamed from: а.а.а.а.а.з.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1128 implements ISecureSignatureComponent {

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1714 = null;

    public C1128(SecurityGuardMainPlugin securityGuardMainPlugin) {
        init(securityGuardMainPlugin, new Object[0]);
    }

    @Override // com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent
    public String getSafeCookie(String str, String str2, String str3) throws SecException {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("INPUT", str);
            SecurityGuardParamContext securityGuardParamContext = new SecurityGuardParamContext();
            securityGuardParamContext.appKey = str2;
            securityGuardParamContext.paramMap = hashMap;
            securityGuardParamContext.requestType = 3;
            String signRequest = ((ISecureSignatureComponent) this.f1714.getInterface(ISecureSignatureComponent.class)).signRequest(securityGuardParamContext, str3);
            String staticSafeEncrypt = ((IStaticDataEncryptComponent) this.f1714.getInterface(IStaticDataEncryptComponent.class)).staticSafeEncrypt(16, str2, signRequest + str, str3);
            return "AE001" + staticSafeEncrypt;
        } catch (SecException e) {
            int errorCode = e.getErrorCode();
            int i = SecExceptionCode.SEC_ERROR_SIGNATRUE_UNKNOWN;
            if (errorCode <= 600 || e.getErrorCode() >= 699) {
                switch (e.getErrorCode()) {
                    case 302:
                        i = 607;
                        break;
                    case 303:
                        i = 608;
                        break;
                    case 304:
                        i = 304;
                        break;
                    case 305:
                        i = 305;
                        break;
                    case 306:
                        i = 306;
                        break;
                    case 307:
                        i = 307;
                        break;
                    case 308:
                        i = 308;
                        break;
                }
                throw new SecException(i);
            }
            throw e;
        }
    }

    @Override // com.alibaba.wireless.security.open.IComponent
    public int init(ISecurityGuardPlugin iSecurityGuardPlugin, Object... objArr) {
        this.f1714 = iSecurityGuardPlugin;
        return 0;
    }

    @Override // com.alibaba.wireless.security.open.securesignature.ISecureSignatureComponent
    public String signRequest(SecurityGuardParamContext securityGuardParamContext, String str) throws SecException {
        Map<String, String> map;
        if (securityGuardParamContext == null || (map = securityGuardParamContext.paramMap) == null) {
            throw new SecException("", 601);
        }
        String str2 = securityGuardParamContext.appKey;
        int i = securityGuardParamContext.requestType;
        if (map == null || map.isEmpty()) {
            throw new SecException("", 601);
        }
        if (i == 0) {
            if (map.get(SecureSignatureDefine.OPEN_KEY_SIGN_SEEDKEY) == null) {
                throw new SecException(606);
            }
        } else if (i == 5 || i == 7 || i == 8) {
            String str3 = map.get("ATLAS");
            if (map.size() == 2 && (str3 == null || str3.length() <= 0)) {
                throw new SecException(601);
            }
        }
        String str4 = (String) this.f1714.getRouter().doCommand(cdw.T_RELATIVELAYOUT_BASE, map, str2, Integer.valueOf(i), str, Boolean.TRUE);
        return ((i == 0 || i == 2) && str4 != null) ? str4.toUpperCase() : str4;
    }
}
