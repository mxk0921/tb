package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rfa implements zhb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f27339a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f27340a;

        public a(Activity activity) {
            this.f27340a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                Nav.from(this.f27340a).withFlags(65536).disableTransition().toUri(rfa.b(rfa.this).getString("url"));
            }
        }
    }

    static {
        t2o.a(793772065);
        t2o.a(793772067);
    }

    public rfa(String str) {
        this.f27339a = JSON.parseObject(str);
    }

    public static /* synthetic */ JSONObject b(rfa rfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cd4dd01e", new Object[]{rfaVar});
        }
        return rfaVar.f27339a;
    }

    @Override // tb.zhb
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb311dd", new Object[]{this, activity});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new a(activity), 10L);
        }
    }
}
