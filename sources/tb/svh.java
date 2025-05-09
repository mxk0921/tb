package tb;

import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class svh extends MetricAffectingSpan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f28302a;
    public final int b;
    public final String c;

    static {
        t2o.a(986710214);
    }

    public svh(int i, int i2, String str) {
        this.f28302a = i;
        this.b = i2;
        this.c = str;
    }

    public static /* synthetic */ Object ipc$super(svh svhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/richtext/span/MUSCustomStyleSpan");
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21f6b6b", new Object[]{this, textPaint});
        } else if (Build.VERSION.SDK_INT >= 28 || hxh.a()) {
            rmt.a(textPaint, this.b, this.f28302a, this.c);
        } else {
            try {
                ult.h().d(textPaint, this.c, this.f28302a, this.b);
            } catch (Exception e) {
                dwh.i(e);
            }
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77906dc3", new Object[]{this, textPaint});
        } else if (Build.VERSION.SDK_INT >= 28 || hxh.a()) {
            rmt.a(textPaint, this.b, this.f28302a, this.c);
        } else {
            try {
                ult.h().d(textPaint, this.c, this.f28302a, this.b);
            } catch (Exception e) {
                dwh.i(e);
            }
        }
    }
}
