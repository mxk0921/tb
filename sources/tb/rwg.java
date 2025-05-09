package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;
import com.taobao.taolive.uikit.api.TBLiveOpenCardView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782226);
    }

    public final Context d(Context context) {
        Context context2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("240efdad", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof bew) {
            context2 = ((bew) context).b();
        } else if (context instanceof cew) {
            context2 = ((cew) context).a();
        } else {
            context2 = null;
        }
        if (context2 instanceof Activity) {
            return context2;
        }
        return null;
    }

    public boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc7fbbf1", new Object[]{this, context})).booleanValue();
        }
        Context d = d(context);
        j9t e = j9t.e(d, "homepage");
        if (e != null) {
            return e.b().isAutoPlayVideoUnderCurrentNetwork(d);
        }
        return false;
    }

    public boolean a(cfc cfcVar, xwg xwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a11ca258", new Object[]{this, cfcVar, xwgVar})).booleanValue();
        }
        if (xwgVar.y()) {
            return f(cfcVar);
        }
        fve.e("LiveCardConfigHelper", "tbPlayVideo attr is false");
        return false;
    }

    public boolean b(TBLiveOpenCardView tBLiveOpenCardView) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f0cca73", new Object[]{this, tBLiveOpenCardView})).booleanValue();
        }
        if (tBLiveOpenCardView == null) {
            fve.e("LiveCardConfigHelper", "live image view is null");
            return false;
        } else if (tBLiveOpenCardView.getVisibility() != 0) {
            fve.e("LiveCardConfigHelper", "live image view is not visible");
            return false;
        } else if (d(tBLiveOpenCardView.getContext()) != null) {
            return true;
        } else {
            if (tBLiveOpenCardView.getContext() == null) {
                str = "null";
            } else {
                str = tBLiveOpenCardView.getContext().getClass().getSimpleName();
            }
            fve.e("LiveCardConfigHelper", "can not find activity context。current context = ".concat(str));
            return false;
        }
    }

    public boolean c(TBLiveOpenCardView tBLiveOpenCardView, xwg xwgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b269e9d", new Object[]{this, tBLiveOpenCardView, xwgVar})).booleanValue();
        }
        if (tBLiveOpenCardView == null) {
            fve.e("LiveCardConfigHelper", "live image view is null");
            return false;
        } else if (tBLiveOpenCardView.getHeight() == 0) {
            fve.e("LiveCardConfigHelper", "live image view height is 0");
            return false;
        } else {
            Rect rect = new Rect();
            tBLiveOpenCardView.getGlobalVisibleRect(rect);
            float height = (rect.height() * 1.0f) / tBLiveOpenCardView.getHeight();
            double b = xwgVar.b();
            if (height < 0.0f || height >= b) {
                return true;
            }
            fve.e("LiveCardConfigHelper", "dx rootView expose ratio too few. exposeRatio = " + height + ";minPlayExposeRatio = " + b);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean f(cfc cfcVar) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abb18fe4", new Object[]{this, cfcVar})).booleanValue();
        }
        IConfigService iConfigService = (IConfigService) cfcVar.a(IConfigService.class);
        if (iConfigService == null) {
            return false;
        }
        String string = iConfigService.getString("DX3LiveEnableLevel", "LevelHighMid");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        String a2 = sue.a();
        fve.e("LiveCardConfigHelper", "orange live enableLevel = " + string + ";deviceLevel = " + a2);
        switch (string.hashCode()) {
            case -2067010659:
                if (string.equals("LevelAll")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1936070334:
                if (string.equals("LevelHighMid")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 347384614:
                if (string.equals("LevelHigh")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 347569340:
                if (string.equals("LevelNone")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return TextUtils.equals("h", a2) || TextUtils.equals("m", a2);
        }
        if (c != 2) {
            return false;
        }
        return TextUtils.equals("h", a2);
    }
}
