package tb;

import android.app.Activity;
import com.ali.user.mobile.model.SNSSignInAccount;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface wmo {
    void onCancel(Activity activity, String str, String str2);

    void onError(Activity activity, String str, int i, String str2, String str3);

    void onSucceed(Activity activity, SNSSignInAccount sNSSignInAccount);
}
