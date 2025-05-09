package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import java.util.Map;
import tb.dov;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class d70 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705103);
        }

        public a() {
        }

        public final boolean a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a0a86c05", new Object[]{this, map})).booleanValue();
            }
            ckf.g(map, "params");
            return TextUtils.equals(map.get(dov.KEY_IS_USE_NEW_PUBLISHER), "1");
        }

        public final boolean b(Context context) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("740473bd", new Object[]{this, context})).booleanValue();
            }
            ckf.g(context, "context");
            IUGCMedia n = muu.n(context);
            if (n != null) {
                str = n.getPublishSessionId();
            } else {
                str = null;
            }
            dov.a b = dov.b(str);
            ckf.f(b, "UrlParams.of(ugcMedia?.publishSessionId)");
            if (b.h(dov.KEY_IS_USE_NEW_PUBLISHER, 0) == 1) {
                return true;
            }
            return false;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(511705102);
    }
}
