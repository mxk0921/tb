package а.б.а.а.а.е;

import com.alibaba.wireless.security.framework.IRouterComponent;
import com.alibaba.wireless.security.mainplugin.SecurityGuardMainPlugin;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin;
import com.taobao.wireless.security.sdk.SecurityGuardParamContext;
import com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import tb.cdw;

/* renamed from: а.б.а.а.а.е.а  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C1138 implements ISecureSignatureComponent {

    /* renamed from: а  reason: contains not printable characters */
    private ISecurityGuardPlugin f1742;

    public C1138(SecurityGuardMainPlugin securityGuardMainPlugin) {
        this.f1742 = null;
        this.f1742 = securityGuardMainPlugin;
    }

    @Override // com.taobao.wireless.security.sdk.securesignature.ISecureSignatureComponent
    public String signRequest(SecurityGuardParamContext securityGuardParamContext) {
        if (!(securityGuardParamContext == null || securityGuardParamContext.paramMap == null)) {
            try {
                SecurityGuardParamContext securityGuardParamContext2 = new SecurityGuardParamContext();
                securityGuardParamContext2.appKey = securityGuardParamContext.appKey;
                securityGuardParamContext2.paramMap = securityGuardParamContext.paramMap;
                securityGuardParamContext2.requestType = securityGuardParamContext.requestType;
                securityGuardParamContext2.reserved1 = securityGuardParamContext.reserved1;
                securityGuardParamContext2.reserved2 = securityGuardParamContext.reserved2;
                return m1151(securityGuardParamContext2, "");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: а  reason: contains not printable characters */
    public String m1151(SecurityGuardParamContext securityGuardParamContext, String str) throws SecException {
        Object obj;
        String str2 = securityGuardParamContext.appKey;
        HashMap hashMap = (HashMap) securityGuardParamContext.paramMap;
        int i = securityGuardParamContext.requestType;
        if (hashMap == null || hashMap.isEmpty()) {
            throw new SecException(601);
        }
        if (i == 15 && hashMap.get("EXT") == null) {
            hashMap.put("EXT", "");
        }
        if (i == 9) {
            str2 = "";
        } else if (str2 == null || str2.length() == 0) {
            throw new SecException("", 601);
        }
        if ((i == 17 || i == 19) && securityGuardParamContext.paramMap.size() == 2 && securityGuardParamContext.paramMap.get("ATLAS") == null) {
            throw new SecException(601);
        }
        if (i == 10) {
            String str3 = securityGuardParamContext.paramMap.get("INPUT");
            byte[] bArr = null;
            if (str3 != null) {
                try {
                    bArr = str3.getBytes("UTF-8");
                } catch (UnsupportedEncodingException unused) {
                    throw new SecException("", 601);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("INPUT", bArr);
            IRouterComponent router = this.f1742.getRouter();
            Object[] objArr = new Object[5];
            objArr[0] = hashMap2;
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(i);
            if (str == null) {
                str = "";
            }
            objArr[3] = str;
            objArr[4] = Boolean.FALSE;
            obj = router.doCommand(cdw.T_RELATIVELAYOUT_BASE, objArr);
        } else {
            IRouterComponent router2 = this.f1742.getRouter();
            Object[] objArr2 = new Object[5];
            objArr2[0] = hashMap;
            objArr2[1] = str2;
            objArr2[2] = Integer.valueOf(i);
            if (str == null) {
                str = "";
            }
            objArr2[3] = str;
            objArr2[4] = Boolean.FALSE;
            obj = router2.doCommand(cdw.T_RELATIVELAYOUT_BASE, objArr2);
        }
        String str4 = (String) obj;
        return ((i == 2 || i == 8) && str4 != null) ? str4.toUpperCase() : str4;
    }
}
