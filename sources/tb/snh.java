package tb;

import android.content.Context;
import android.graphics.Typeface;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/snh;", "Ltb/iu9;", "Landroid/content/Context;", "ctx", "<init>", "(Landroid/content/Context;)V", "megaDesign_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class snh extends iu9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f28160a;
    public y7c b;

    public snh(Context context) {
        ckf.g(context, "ctx");
        this.f28160a = context;
    }

    public static /* synthetic */ Object ipc$super(snh snhVar, String str, Object... objArr) {
        if (str.hashCode() == 552682597) {
            String str2 = (String) objArr[0];
            snhVar.getClass();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megadesign/anim/lottie/delegate/MAFontDelegate");
    }

    @Override // tb.iu9
    public Typeface a(String str) {
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("c0aebb70", new Object[]{this, str});
        }
        try {
            y7c y7cVar = this.b;
            if (y7cVar != null) {
                typeface = y7cVar.a(str);
            } else {
                typeface = null;
            }
            if (typeface != null) {
                return typeface;
            }
            return Typeface.createFromAsset(this.f28160a.getAssets(), str);
        } catch (Throwable th) {
            AppMonitor.Counter.commit("MegaDesign", "LottieTypefaceCreateError", th.toString(), 1.0d);
            return Typeface.DEFAULT;
        }
    }

    @Override // tb.iu9
    public String b(String str) {
        String b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20f14465", new Object[]{this, str});
        }
        y7c y7cVar = this.b;
        if (y7cVar == null || (b = y7cVar.b(str)) == null) {
            return null;
        }
        return b;
    }

    public final void c(y7c y7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a1587b", new Object[]{this, y7cVar});
        } else {
            this.b = y7cVar;
        }
    }
}
