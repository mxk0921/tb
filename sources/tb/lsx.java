package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import com.alipay.android.phone.iifaa.did.common.DigitalEnvelopeModel;
import com.alipay.android.phone.iifaa.did.model.DecentralizedID;
import com.alipay.android.phone.iifaa.did.model.DocumentSignData;
import com.alipay.android.phone.iifaa.did.model.VerifiableCredential;
import com.alipay.android.phone.iifaa.did.model.VerifiableCredentialBasicInfo;
import com.alipay.android.phone.iifaa.did.model.VerificationMethod;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.msx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class lsx {
    public static int a(int i, int i2) {
        return i + (i2 << 8);
    }

    public static DIDResult b(Context context, String str, DecentralizedID decentralizedID) {
        if (TextUtils.isEmpty(str)) {
            return new DIDResult(DIDResult.a.WRONG_PARAMS).setMessage("数据异常，无法解密");
        }
        DigitalEnvelopeModel digitalEnvelopeModel = (DigitalEnvelopeModel) JSON.parseObject(str, DigitalEnvelopeModel.class);
        if (digitalEnvelopeModel == null || DigitalEnvelopeModel.isInValidEncEnvelope(digitalEnvelopeModel)) {
            return new DIDResult(DIDResult.a.WRONG_PARAMS).setMessage("数据异常，信封加密数据不完整，无法解密");
        }
        VerificationMethod verificationMethod = null;
        for (VerificationMethod verificationMethod2 : decentralizedID.getVerificationMethods()) {
            if (verificationMethod2.getId().equalsIgnoreCase(digitalEnvelopeModel.getKeyAlias())) {
                verificationMethod = verificationMethod2;
            }
        }
        if (verificationMethod == null) {
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA).setMessage("该DID下 无对应的VMID");
        }
        if (VerificationMethod.VM_JWK2020.equals(verificationMethod.getType())) {
            return new jxx(verificationMethod.getPublicKeyJwk()).b(context, digitalEnvelopeModel.getKeyAlias(), str, "vcDecrypt");
        }
        DIDResult dIDResult = new DIDResult(DIDResult.a.NOT_SUPPORT);
        return dIDResult.setMessage("暂不支持该类型的DID授权，type：" + verificationMethod.getType());
    }

    public static DIDResult c(String str, String str2) {
        String str3;
        try {
            if (str.hashCode() == 82200 && str.equals("SM2")) {
                gtx a2 = msx.b().c.a();
                if (a2 == null) {
                    u("genDIDKeyInfo, 秘钥对创建失败，algorithm：".concat(str));
                    return new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO).setMessage("秘钥对创建失败");
                }
                String str4 = a2.f20232a;
                u("genDIDKeyInfo, 公钥 Der1：" + str4);
                String j = j(str4);
                u("genDIDKeyInfo, 公钥 Der2：" + j);
                String e = e(j);
                if (TextUtils.isEmpty(e)) {
                    return new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO).setMessage("公钥Hash异常");
                }
                u("genDIDKeyInfo, 秘钥索引：" + e);
                zwx zwxVar = msx.b().b;
                StringBuilder sb = new StringBuilder();
                sb.append(a2.b);
                if (TextUtils.isEmpty(str2)) {
                    str3 = "";
                } else {
                    str3 = "_" + str2;
                }
                sb.append(str3);
                if (((msx.a) zwxVar).b("my_did_appid", e, sb.toString())) {
                    return new DIDResult(DIDResult.a.SUCCESS).setPublicKey(j);
                }
                u("genDIDKeyInfo, 秘钥存储异常");
                return new DIDResult(DIDResult.a.FAILED_WRITE_FILE).setMessage("秘钥存储异常");
            }
            return new DIDResult(DIDResult.a.WRONG_PARAMS);
        } catch (Exception e2) {
            u("genDIDKeyInfo, RSA 秘钥长度 参数异常，e:" + e2.getMessage());
            return new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO).setMessage("RSA 秘钥长度 参数异常，e:" + e2.getMessage());
        }
    }

    public static String d() {
        List parseArray = JSON.parseArray(((msx.a) msx.b().b).c("my_did_appid", "did_alias"), String.class);
        if (parseArray == null || parseArray.size() <= 0) {
            return null;
        }
        return (String) parseArray.get(0);
    }

    public static String e(String str) {
        try {
            return g(MessageDigest.getInstance("MD5").digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String f(String str, DigitalEnvelopeModel digitalEnvelopeModel, String str2) {
        int hashCode = str.hashCode();
        String str3 = null;
        if (hashCode == -1089186788) {
            str.equals("ENVELOP_IIFAA");
        } else if (hashCode == -40278557 && str.equals("SM2_SM4_CBC_PKCS5")) {
            String keyCipher = digitalEnvelopeModel.getKeyCipher();
            String cipher = digitalEnvelopeModel.getCipher();
            try {
                if (i(str2, keyCipher, cipher)) {
                    t("wrong params");
                } else {
                    byte[] a2 = msx.b().c.a("SM2", str2, n(keyCipher));
                    if (a2.length != 32) {
                        t("wrong key cipher, should be  { Key 16byte + IV 16byte }");
                    } else {
                        byte[] copyOfRange = Arrays.copyOfRange(a2, 0, 16);
                        byte[] copyOfRange2 = Arrays.copyOfRange(a2, 16, 32);
                        str3 = new String(msx.b().c.a("SM4_CBC_PKCS7Padding", copyOfRange, copyOfRange2, n(cipher)), Charset.defaultCharset());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str3;
        }
        t("Not support envelop type:".concat(str));
        return null;
    }

    public static String g(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static List<VerifiableCredentialBasicInfo> h(String str, List<String> list, String str2) {
        ArrayList arrayList = new ArrayList();
        String c = ((msx.a) msx.b().b).c("my_did_appid", m(str));
        if (TextUtils.isEmpty(c)) {
            return arrayList;
        }
        List<VerifiableCredentialBasicInfo> parseArray = JSON.parseArray(c, VerifiableCredentialBasicInfo.class);
        if ((list == null || list.size() == 0) && TextUtils.isEmpty(str2)) {
            return parseArray;
        }
        if (!(list == null || list.size() == 0)) {
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : list) {
                for (VerifiableCredentialBasicInfo verifiableCredentialBasicInfo : parseArray) {
                    if (verifiableCredentialBasicInfo.getType().contains(str3)) {
                        arrayList2.add(verifiableCredentialBasicInfo);
                    }
                }
            }
            parseArray = arrayList2;
        }
        if (TextUtils.isEmpty(str2)) {
            return parseArray;
        }
        ArrayList arrayList3 = new ArrayList();
        for (VerifiableCredentialBasicInfo verifiableCredentialBasicInfo2 : parseArray) {
            if (str2.equals(verifiableCredentialBasicInfo2.getIssuer())) {
                arrayList3.add(verifiableCredentialBasicInfo2);
            }
        }
        return arrayList3;
    }

    public static boolean i(String... strArr) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    public static String j(String str) {
        return str.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----\n", "").replace("\n", "").replace("\r", "");
    }

    public static String k(byte[] bArr) {
        return new String(Base64.encode(bArr, 0), Charset.defaultCharset()).replace("\n", "").replace("\r", "");
    }

    public static String l(String str) {
        return str + "_key_alias";
    }

    public static String m(String str) {
        return str + "_vclist";
    }

    public static byte[] n(String str) {
        return Base64.decode(str.getBytes(Charset.defaultCharset()), 0);
    }

    public static DecentralizedID o(String str) {
        DocumentSignData p = p(str);
        if (p == null || TextUtils.isEmpty(p.getDocument())) {
            u("getDIDModel,本地对应DID Document数据");
            return null;
        }
        DecentralizedID fromJson = DecentralizedID.fromJson(p.getDocument());
        if (fromJson != null) {
            return fromJson;
        }
        u("getDIDModel,本地对应DID Document 结构异常");
        return fromJson;
    }

    public static DocumentSignData p(String str) {
        String c = ((msx.a) msx.b().b).c("my_did_appid", str);
        if (!TextUtils.isEmpty(c)) {
            return (DocumentSignData) JSON.parseObject(c, DocumentSignData.class);
        }
        return null;
    }

    public static String q(String str) {
        Throwable e;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : instance.digest()) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append("0");
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public static byte[] r(String str) {
        if (str == null || str.isEmpty()) {
            return new byte[0];
        }
        String lowerCase = str.toLowerCase();
        int length = lowerCase.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) ((((byte) (Character.digit(lowerCase.charAt(i), 16) & 255)) << 4) | ((byte) (Character.digit(lowerCase.charAt(i + 1), 16) & 255)));
            i += 2;
        }
        return bArr;
    }

    public static DIDResult s(String str) {
        DocumentSignData documentSignData = (DocumentSignData) JSON.parseObject(str, DocumentSignData.class);
        if (documentSignData == null || TextUtils.isEmpty(documentSignData.getDocument())) {
            u("importDID, DocumentSignData 格式异常");
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA).setMessage("did Document 格式异常");
        }
        DecentralizedID fromJson = DecentralizedID.fromJson(documentSignData.getDocument());
        if (fromJson == null || TextUtils.isEmpty(fromJson.getId())) {
            u("importDID, did Document 格式异常");
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA).setMessage("did Document 格式异常");
        }
        for (VerificationMethod verificationMethod : fromJson.getVerificationMethods()) {
            if (TextUtils.isEmpty(((msx.a) msx.b().b).c("my_did_appid", l(verificationMethod.getId())))) {
                String derPubKey = VerificationMethod.getDerPubKey(verificationMethod);
                if (TextUtils.isEmpty(derPubKey)) {
                    u("importDID, 计算临时索引时，公钥解析异常");
                    return new DIDResult(DIDResult.a.FAILED_PARSE_DATA).setMessage("公钥解析异常");
                }
                String e = e(derPubKey);
                String c = ((msx.a) msx.b().b).c("my_did_appid", e);
                u("importDID,VM ID：" + verificationMethod.getId());
                u("importDID,临时秘钥索引：" + e);
                ((msx.a) msx.b().b).d("my_did_appid", e);
                if (TextUtils.isEmpty(c)) {
                    u("importDID, 本地秘钥查询异常");
                    return new DIDResult(DIDResult.a.FAILED_READ_FILE).setMessage("本地秘钥查询异常");
                }
                if (!((msx.a) msx.b().b).b("my_did_appid", l(verificationMethod.getId()), c)) {
                    u("importDID, 本地秘钥索引更新失败");
                    return new DIDResult(DIDResult.a.FAILED_WRITE_FILE).setMessage("本地秘钥索引更新失败");
                }
            }
        }
        List parseArray = JSON.parseArray(((msx.a) msx.b().b).c("my_did_appid", "did_alias"), String.class);
        if (parseArray == null) {
            parseArray = new ArrayList();
        }
        if (!parseArray.contains(fromJson.getId())) {
            parseArray.add(fromJson.getId());
        }
        if (((msx.a) msx.b().b).b("my_did_appid", "did_alias", JSON.toJSONString(parseArray))) {
            if (((msx.a) msx.b().b).b("my_did_appid", fromJson.getId(), str)) {
                return new DIDResult(DIDResult.a.SUCCESS).setDid(fromJson.getId());
            }
        }
        u("importDID, 更新DID索引数据 或 写入DID Document 异常");
        w(fromJson.getId());
        return new DIDResult(DIDResult.a.FAILED_WRITE_FILE).setMessage("更新DID索引数据 或 写入DID Document 异常");
    }

    public static void t(String str) {
        lux.a().b("EnvelopCryptoUtils", str);
    }

    public static void u(String str) {
        lux.a().d("DIDDataHelper", str);
    }

    public static DIDResult v(String str) {
        VerifiableCredential verifiableCredential;
        boolean z;
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null || (!parseObject.containsKey("vc") && !parseObject.containsKey("credentialSubject"))) {
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA.ordinal(), "VC数据格式异常，解析失败");
        }
        if (parseObject.containsKey("credentialSubject")) {
            verifiableCredential = (VerifiableCredential) JSON.parseObject(str, VerifiableCredential.class);
            z = false;
        } else if (!parseObject.containsKey("vc")) {
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA.ordinal(), "VC数据格式异常，解析失败");
        } else {
            verifiableCredential = (VerifiableCredential) JSON.parseObject(parseObject.getString("vc"), VerifiableCredential.class);
            z = true;
        }
        if (verifiableCredential == null) {
            return new DIDResult(DIDResult.a.FAILED_PARSE_DATA.ordinal(), "VC Json解析异常");
        }
        DIDResult vcModel = new DIDResult(DIDResult.a.SUCCESS).setVcModel(verifiableCredential);
        if (z) {
            parseObject.remove("vc");
            vcModel.setVcExt(parseObject);
        }
        return vcModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean w(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lsx.w(java.lang.String):boolean");
    }
}
