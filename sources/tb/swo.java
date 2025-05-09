package tb;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class swo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f28327a;
    public final boolean b;
    public boolean c;
    public final boolean d = a9l.w().b0();
    public OnScreenChangedListener e;

    static {
        t2o.a(790626553);
    }

    public swo(Context context) {
        this.f28327a = vem.g(context);
        this.b = vem.h(context);
    }

    public void b(final PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e23f08", new Object[]{this, popLayerBaseView});
        } else if (this.d) {
            if (this.f28327a || this.b) {
                this.e = new OnScreenChangedListener() { // from class: tb.rwo
                    @Override // com.taobao.android.autosize.OnScreenChangedListener
                    public /* synthetic */ void onActivityChanged(Activity activity, int i, Configuration configuration) {
                        guk.a(this, activity, i, configuration);
                    }

                    @Override // com.taobao.android.autosize.OnScreenChangedListener
                    public final void onScreenChanged(int i, Configuration configuration) {
                        swo.this.c(popLayerBaseView, i, configuration);
                    }
                };
                TBAutoSizeConfig.x().d0(this.e);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432a75df", new Object[]{this});
        } else if (this.e != null) {
            TBAutoSizeConfig.x().h0(this.e);
        }
    }

    public final /* synthetic */ void c(PopLayerBaseView popLayerBaseView, int i, Configuration configuration) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf6781d", new Object[]{this, popLayerBaseView, new Integer(i), configuration});
            return;
        }
        boolean z = 1 == i;
        try {
            if (this.c == z) {
                wdm.d("OnScreenChanged.sameCallBack.ignore.changeType=%s", Integer.valueOf(i));
                return;
            }
            this.c = z;
            wdm.d("OnScreenChanged.changeType=%s", Integer.valueOf(i));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFoldDevice", (Object) String.valueOf(this.f28327a));
            jSONObject.put("isTabletDevice", (Object) String.valueOf(this.b));
            if (z) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            jSONObject.put("changeType", (Object) str);
            popLayerBaseView.onReceiveEvent("PopLayer.ScreenChange", jSONObject.toJSONString());
        } catch (Throwable th) {
            wdm.h("OnScreenChanged.OnScreenChangedListener.error", th);
        }
    }
}
