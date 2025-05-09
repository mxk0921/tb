package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import com.alipay.android.phone.iifaa.did.model.DecentralizedID;
import com.alipay.android.phone.iifaa.did.model.DocumentSignData;
import com.alipay.android.phone.iifaa.did.model.PublicKeyJwk;
import com.alipay.android.phone.iifaa.did.model.VerificationMethod;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.alipay.android.phone.iifaa.did.rpc.model.DidIdpRpcRequest;
import com.alipay.android.phone.iifaa.did.rpc.model.DidIdpRpcResponse;
import com.alipay.android.phone.iifaa.did.rpc.service.IifaaDidService;
import com.alipay.mobile.framework.service.common.impl.MpaasRpcServiceImpl;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class asx implements qwx {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15981a;
        public final /* synthetic */ DecentralizedID b;
        public final /* synthetic */ DIDResult c;
        public final /* synthetic */ CredentialRpcData d;

        public a(asx asxVar, Context context, DecentralizedID decentralizedID, DIDResult dIDResult, CredentialRpcData credentialRpcData) {
            this.f15981a = context;
            this.b = decentralizedID;
            this.c = dIDResult;
            this.d = credentialRpcData;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r11 = this;
                android.content.Context r0 = r11.f15981a
                com.alipay.android.phone.iifaa.did.model.DecentralizedID r1 = r11.b
                com.alipay.android.phone.iifaa.did.api.DIDResult r2 = r11.c
                com.alipay.android.phone.iifaa.did.model.VerifiableCredential r2 = r2.getVcModel()
                com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData r3 = r11.d
                com.alipay.android.phone.iifaa.did.common.DigitalEnvelopeModel r3 = r3.vcData
                java.lang.String r3 = com.alibaba.fastjson.JSON.toJSONString(r3)
                java.lang.String r4 = r1.getId()
                java.lang.String r5 = r2.getId()
                java.lang.String r4 = tb.lsx.e(r4)
                java.lang.String r5 = tb.lsx.e(r5)
                r6 = 0
                android.content.SharedPreferences r4 = r0.getSharedPreferences(r4, r6)
                if (r4 == 0) goto L_0x00f3
                android.content.SharedPreferences$Editor r4 = r4.edit()
                r4.putString(r5, r3)
                boolean r3 = r4.commit()
                if (r3 == 0) goto L_0x00f3
                com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo r3 = new com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo
                r3.<init>(r2)
                tb.msx r2 = tb.msx.b()
                tb.zwx r2 = r2.b
                java.lang.String r4 = r1.getId()
                java.lang.String r4 = tb.lsx.m(r4)
                tb.msx$a r2 = (tb.msx.a) r2
                java.lang.String r5 = "my_did_appid"
                java.lang.String r2 = r2.c(r5, r4)
                java.lang.Class<com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo> r4 = com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo.class
                java.util.List r2 = com.alibaba.fastjson.JSON.parseArray(r2, r4)
                if (r2 != 0) goto L_0x005f
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
            L_0x005f:
                java.util.Iterator r4 = r2.iterator()
                r7 = 0
            L_0x0064:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x008e
                java.lang.Object r8 = r4.next()
                com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo r8 = (com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo) r8
                java.lang.String r9 = r3.getIssuer()
                java.lang.String r10 = r8.getIssuer()
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x0064
                java.util.List r9 = r3.getType()
                java.util.List r10 = r8.getType()
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x0064
                r7 = r8
                goto L_0x0064
            L_0x008e:
                if (r7 == 0) goto L_0x0093
                r2.remove(r7)
            L_0x0093:
                boolean r4 = r2.contains(r3)
                if (r4 != 0) goto L_0x009c
                r2.add(r3)
            L_0x009c:
                tb.msx r4 = tb.msx.b()
                tb.zwx r4 = r4.b
                java.lang.String r8 = r1.getId()
                java.lang.String r8 = tb.lsx.m(r8)
                java.lang.String r2 = com.alibaba.fastjson.JSON.toJSONString(r2)
                tb.msx$a r4 = (tb.msx.a) r4
                boolean r2 = r4.b(r5, r8, r2)
                if (r2 != 0) goto L_0x00c4
                com.alipay.android.phone.iifaa.did.api.DIDResult r0 = new com.alipay.android.phone.iifaa.did.api.DIDResult
                com.alipay.android.phone.iifaa.did.api.DIDResult$a r1 = com.alipay.android.phone.iifaa.did.api.DIDResult.a.FAILED_WRITE_FILE
                int r1 = r1.ordinal()
                java.lang.String r2 = "VC 持久化存储失败"
                r0.<init>(r1, r2)
                goto L_0x0100
            L_0x00c4:
                if (r7 == 0) goto L_0x00e7
                java.lang.String r1 = r1.getId()
                java.lang.String r2 = r7.getId()
                java.lang.String r1 = tb.lsx.e(r1)
                java.lang.String r2 = tb.lsx.e(r2)
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r6)
                if (r0 == 0) goto L_0x00e7
                android.content.SharedPreferences$Editor r0 = r0.edit()
                android.content.SharedPreferences$Editor r0 = r0.remove(r2)
                r0.apply()
            L_0x00e7:
                com.alipay.android.phone.iifaa.did.api.DIDResult r0 = new com.alipay.android.phone.iifaa.did.api.DIDResult
                com.alipay.android.phone.iifaa.did.api.DIDResult$a r1 = com.alipay.android.phone.iifaa.did.api.DIDResult.a.SUCCESS
                r0.<init>(r1)
                com.alipay.android.phone.iifaa.did.api.DIDResult r0 = r0.setVcBasicInfo(r3)
                goto L_0x0100
            L_0x00f3:
                com.alipay.android.phone.iifaa.did.api.DIDResult r0 = new com.alipay.android.phone.iifaa.did.api.DIDResult
                com.alipay.android.phone.iifaa.did.api.DIDResult$a r1 = com.alipay.android.phone.iifaa.did.api.DIDResult.a.FAILED_WRITE_FILE
                int r1 = r1.ordinal()
                java.lang.String r2 = "VC 密文 持久化存储失败"
                r0.<init>(r1, r2)
            L_0x0100:
                com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo r0 = r0.getVcBasicInfo()
                if (r0 != 0) goto L_0x0112
                tb.lux r0 = tb.lux.a()
                java.lang.String r1 = "TrustedCertServiceImpl"
                java.lang.String r2 = "凭证导入失败"
                r0.b(r1, r2)
            L_0x0112:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.asx.a.run():void");
        }
    }

    public final DecentralizedID b(Context context) {
        DocumentSignData documentSignData;
        try {
            VerificationMethod e = e();
            if (e == null) {
                lux.a().b("TrustedCertServiceImpl", "SM2 VM 创建失败");
                return null;
            }
            DidIdpRpcResponse f = f(context, DidIdpRpcRequest.ACTION_CREATE, e, null, null);
            if (!(f == null || (documentSignData = f.signDocument) == null)) {
                String did = lsx.s(JSON.toJSONString(documentSignData)).getDid();
                if (!TextUtils.isEmpty(did)) {
                    return lsx.o(did);
                }
                lux.a().b("TrustedCertServiceImpl", "DID 导入失败");
                return null;
            }
            lux.a().b("TrustedCertServiceImpl", "DID 创建失败");
            return null;
        } catch (Exception e2) {
            lux.a().b("TrustedCertServiceImpl", "DID 创建异常");
            lux.a().b("TrustedCertServiceImpl", e2.getLocalizedMessage());
            return null;
        }
    }

    public final DecentralizedID c(Context context, String str, DocumentSignData documentSignData) {
        try {
            VerificationMethod e = e();
            if (e == null) {
                lux.a().b("TrustedCertServiceImpl", "SM2 VM 创建失败");
                return null;
            }
            DidIdpRpcResponse f = f(context, DidIdpRpcRequest.ACTION_ADD_VM, e, str, documentSignData);
            if (f == null || !f.success || 100000 != f.errCode) {
                if (f == null || 100120 != f.errCode) {
                    return null;
                }
                lux.a().b("TrustedCertServiceImpl", "DID文档验签失败，删除后重新创建");
                lsx.w(str);
                return b(context);
            } else if (!TextUtils.isEmpty(lsx.s(JSON.toJSONString(f.signDocument)).getDid())) {
                return lsx.o(str);
            } else {
                lux.a().b("TrustedCertServiceImpl", "DID文档 insertOrUpdateDocument 失败");
                return null;
            }
        } catch (Exception e2) {
            lux.a().b("TrustedCertServiceImpl", "DID 新增VM异常");
            lux.a().b("TrustedCertServiceImpl", e2.getLocalizedMessage());
            return null;
        }
    }

    public final DecentralizedID d(Context context, String str, boolean z) {
        DocumentSignData documentSignData;
        VerificationMethod verificationMethod;
        try {
            lux.a().c("TrustedCertServiceImpl", "进入 getAndCheckAvailableDID,vmType=" + str);
            String d = lsx.d();
            if (!TextUtils.isEmpty(d)) {
                documentSignData = lsx.p(d);
                if (documentSignData == null) {
                    lsx.w(d);
                    d = null;
                }
            } else {
                documentSignData = null;
            }
            if (!TextUtils.isEmpty(d)) {
                DecentralizedID o = lsx.o(d);
                Iterator<VerificationMethod> it = o.getVerificationMethods().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        verificationMethod = null;
                        break;
                    }
                    verificationMethod = it.next();
                    if (VerificationMethod.VM_JWK2020.equalsIgnoreCase(verificationMethod.getType()) && "EC".equalsIgnoreCase(verificationMethod.getPublicKeyJwk().getKty()) && "sm2p256v1".equalsIgnoreCase(verificationMethod.getPublicKeyJwk().getCrv())) {
                        break;
                    }
                }
                if (verificationMethod != null) {
                    return z ? h(context, d, documentSignData) : o;
                }
                if (z) {
                    return c(context, d, documentSignData);
                }
                lux.a().b("TrustedCertServiceImpl", "本地没有满足条件的 VM，VM_TYPE=" + str);
                return null;
            } else if (z) {
                return b(context);
            } else {
                lux.a().b("TrustedCertServiceImpl", "本地无可用 DID");
                return null;
            }
        } catch (Exception e) {
            lux.a().b("TrustedCertServiceImpl", e.getMessage());
            return null;
        }
    }

    public final DidIdpRpcResponse f(Context context, String str, VerificationMethod verificationMethod, String str2, DocumentSignData documentSignData) {
        try {
            MpaasRpcServiceImpl mpaasRpcServiceImpl = new MpaasRpcServiceImpl(context.getApplicationContext());
            IifaaDidService iifaaDidService = (IifaaDidService) mpaasRpcServiceImpl.getRpcProxy(IifaaDidService.class);
            mpaasRpcServiceImpl.getRpcInvokeContext(iifaaDidService).setGwUrl(aux.b().a(context.getApplicationContext()));
            ArrayList arrayList = new ArrayList();
            arrayList.add(verificationMethod);
            DidIdpRpcRequest didIdpRpcRequest = new DidIdpRpcRequest();
            didIdpRpcRequest.action = str;
            didIdpRpcRequest.methods = arrayList;
            didIdpRpcRequest.did = str2;
            didIdpRpcRequest.signDocument = documentSignData;
            lux a2 = lux.a();
            a2.d("TrustedCertServiceImpl", "request: " + JSON.toJSONString(didIdpRpcRequest));
            DidIdpRpcResponse idpDispatch = iifaaDidService.idpDispatch(didIdpRpcRequest);
            lux a3 = lux.a();
            a3.d("TrustedCertServiceImpl", "resp: " + JSON.toJSONString(idpDispatch));
            return idpDispatch;
        } catch (Exception e) {
            lux.a().b("TrustedCertServiceImpl", "接口请求异常");
            lux.a().b("TrustedCertServiceImpl", e.getLocalizedMessage());
            return null;
        }
    }

    public JSONObject g(Context context, JSONObject jSONObject) {
        lux.a().c("TrustedCertServiceImpl", "进入 initDID");
        if (!msx.b().a()) {
            return DIDResult.genResult(DIDResult.a.FAILED_EXCP.ordinal(), "loadDIDSecuritySO failed");
        }
        msx.b().f24280a = context;
        if ("true".equals(OrangeConfig.getInstance().getCustomConfig("IIFAA_DID_FETCH_DISCLOSE_DEMOTED", ""))) {
            return DIDResult.genResult(DIDResult.a.FUNC_DEMOTED.ordinal(), "IIFAA客户端功能降级");
        }
        String string = jSONObject.getString("vmType");
        if (TextUtils.isEmpty(string)) {
            return DIDResult.genResult(DIDResult.a.WRONG_PARAMS);
        }
        DecentralizedID d = d(context, string, true);
        if (d == null) {
            return new DIDResult(DIDResult.a.FAILED_READ_FILE).setMessage("DID 身份状态异常").toJSONObject();
        }
        return new DIDResult(DIDResult.a.SUCCESS).setDid(d.getId()).toJSONObject();
    }

    public final DecentralizedID h(Context context, String str, DocumentSignData documentSignData) {
        try {
            DidIdpRpcResponse f = f(context, DidIdpRpcRequest.ACTION_SYNC, null, str, documentSignData);
            if (f != null && f.success && 100000 == f.errCode) {
                return lsx.o(str);
            }
            if (f == null || 100120 != f.errCode) {
                return null;
            }
            lux.a().b("TrustedCertServiceImpl", "DID文档验签失败，删除后重新创建");
            lsx.w(str);
            return b(context);
        } catch (Exception e) {
            lux.a().b("TrustedCertServiceImpl", "DID 同步异常");
            lux.a().b("TrustedCertServiceImpl", e.getLocalizedMessage());
            return null;
        }
    }

    public final VerificationMethod e() {
        try {
            DIDResult c = lsx.c("SM2", "");
            if (TextUtils.isEmpty(c.getPublicKey())) {
                return null;
            }
            VerificationMethod verificationMethod = new VerificationMethod();
            verificationMethod.setType(VerificationMethod.VM_JWK2020);
            PublicKeyJwk publicKeyJwk = new PublicKeyJwk("EC", "sm2p256v1");
            publicKeyJwk.parseRawPubKey(c.getPublicKey());
            verificationMethod.setPublicKeyJwk(publicKeyJwk);
            verificationMethod.setSecurityLevel(lsx.a(0, 1));
            return verificationMethod;
        } catch (Exception e) {
            lux.a().b("TrustedCertServiceImpl", e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04d5 A[EDGE_INSN: B:297:0x04d5->B:182:0x04d5 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject a(android.content.Context r20, com.alibaba.fastjson.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.asx.a(android.content.Context, com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject");
    }
}
