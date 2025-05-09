package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.android.phone.iifaa.did.api.DIDResult;
import com.alipay.android.phone.iifaa.did.common.DigitalEnvelopeModel;
import com.alipay.android.phone.iifaa.did.model.PublicKeyJwk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class jxx extends qux {

    /* renamed from: a  reason: collision with root package name */
    public final PublicKeyJwk f22275a;

    public jxx(PublicKeyJwk publicKeyJwk) {
        this.f22275a = publicKeyJwk;
    }

    @Override // tb.qux
    public DIDResult a(Context context, String str, String str2) {
        PublicKeyJwk publicKeyJwk = this.f22275a;
        String kty = publicKeyJwk.getKty();
        String crv = publicKeyJwk.getCrv();
        if (lsx.i(kty, crv) || !"EC".equalsIgnoreCase(kty) || !"sm2p256v1".equalsIgnoreCase(crv)) {
            return new DIDResult(DIDResult.a.NOT_SUPPORT).setMessage("暂不支持非国密 jwk");
        }
        try {
            DigitalEnvelopeModel digitalEnvelopeModel = (DigitalEnvelopeModel) JSON.parseObject(str2, DigitalEnvelopeModel.class);
            if (digitalEnvelopeModel != null && !lsx.i(digitalEnvelopeModel.getAlgorithm(), digitalEnvelopeModel.getCipher(), digitalEnvelopeModel.getKeyCipher())) {
                String f = lsx.f("SM2_SM4_CBC_PKCS5", digitalEnvelopeModel, str);
                if (TextUtils.isEmpty(f)) {
                    return new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO);
                }
                return new DIDResult(DIDResult.a.SUCCESS).setData(f);
            }
            return new DIDResult(DIDResult.a.WRONG_PARAMS);
        } catch (Exception e) {
            e.printStackTrace();
            return new DIDResult(DIDResult.a.FAILED_EXCP);
        }
    }

    @Override // tb.qux
    public DIDResult c(Context context, String str, String str2) {
        PublicKeyJwk publicKeyJwk = this.f22275a;
        String kty = publicKeyJwk.getKty();
        String crv = publicKeyJwk.getCrv();
        if (lsx.i(kty, crv) || !"EC".equalsIgnoreCase(kty) || !"sm2p256v1".equalsIgnoreCase(crv)) {
            return new DIDResult(DIDResult.a.NOT_SUPPORT).setMessage("暂不支持非国密 jwk");
        }
        byte[] a2 = msx.b().c.a(str, str2.getBytes(), "1234567812345678".getBytes());
        if (a2 == null || a2.length == 0) {
            return new DIDResult(DIDResult.a.FAILED_OPT_CRYPTO);
        }
        return new DIDResult(DIDResult.a.SUCCESS).setData(lsx.k(a2));
    }
}
