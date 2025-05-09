package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.taolivehome.TaoLiveHomepageActivity;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class v6t implements OnScreenChangedListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile v6t c;

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f29818a;
    public a b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
    }

    static {
        t2o.a(806355503);
    }

    public static v6t a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v6t) ipChange.ipc$dispatch("7447f18f", new Object[0]);
        }
        if (c == null) {
            synchronized (v6t.class) {
                try {
                    if (c == null) {
                        c = new v6t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe4c5214", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        if (this.f29818a == null) {
            this.f29818a = new AtomicBoolean(!TBAutoSizeConfig.x().T(context));
        }
        return this.f29818a.get();
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5023521b", new Object[]{this, aVar});
            return;
        }
        this.b = aVar;
        TBAutoSizeConfig.x().d0(this);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a9d4ab4", new Object[]{this});
            return;
        }
        this.f29818a = null;
        TBAutoSizeConfig.x().h0(this);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
        guk.a(this, activity, i, configuration);
    }

    @Override // com.taobao.android.autosize.OnScreenChangedListener
    public void onScreenChanged(int i, Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
            return;
        }
        if (this.f29818a == null) {
            this.f29818a = new AtomicBoolean();
        }
        if (2 == i) {
            this.f29818a.set(true);
            a aVar = this.b;
            if (aVar != null) {
                ((TaoLiveHomepageActivity) aVar).y3(true);
                return;
            }
            return;
        }
        this.f29818a.set(false);
        a aVar2 = this.b;
        if (aVar2 != null) {
            ((TaoLiveHomepageActivity) aVar2).y3(false);
        }
    }
}
