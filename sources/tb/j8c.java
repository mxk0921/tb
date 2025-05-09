package tb;

import android.app.Activity;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface j8c {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void onFriendsProvider(Object obj, Object obj2, int i, int i2);
    }

    void a(@ShareBizAdapter.FriendsType int i, a aVar);

    boolean b(String str, TBShareContent tBShareContent, Object obj, List<String> list, List<String> list2);

    String c();

    void d(String str, int i, int i2, String str2, int i3, String str3);

    void e(Activity activity);

    void f();
}
