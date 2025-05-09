package tb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.view.CompatibleView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class um7 extends LayoutInflater {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bn7 f29489a;

    static {
        t2o.a(444596234);
    }

    public um7(Context context) {
        super(context);
    }

    public static um7 b(Context context, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (um7) ipChange.ipc$dispatch("9f0f8154", new Object[]{context, bn7Var});
        }
        um7 um7Var = new um7(LayoutInflater.from(context), context);
        um7Var.c(bn7Var);
        return um7Var;
    }

    public static /* synthetic */ Object ipc$super(um7 um7Var, String str, Object... objArr) {
        if (str.hashCode() == 2047588918) {
            return super.inflate(((Number) objArr[0]).intValue(), (ViewGroup) objArr[1]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/DinamicInflater");
    }

    public final CompatibleView a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CompatibleView) ipChange.ipc$dispatch("76307893", new Object[]{this, str, str2});
        }
        Context context = getContext();
        return new CompatibleView(context, str2 + str);
    }

    public void c(bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903d17ed", new Object[]{this, bn7Var});
        } else {
            this.f29489a = bn7Var;
        }
    }

    @Override // android.view.LayoutInflater
    public LayoutInflater cloneInContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LayoutInflater) ipChange.ipc$dispatch("9e726fa6", new Object[]{this, context});
        }
        return LayoutInflater.from(context);
    }

    @Override // android.view.LayoutInflater
    public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e6b08cdf", new Object[]{this, str, attributeSet});
        }
        if (tl7.d(str) != null) {
            try {
                return tn7.b(str, getContext(), attributeSet, this.f29489a);
            } catch (Throwable th) {
                this.f29489a.e().b().a(mm7.ERROR_CODE_VIEW_EXCEPTION, str);
                ym7.c("DinamicInflater", th, "onCreateView failed");
                return a(mm7.ERROR_CODE_VIEW_EXCEPTION, str);
            }
        } else {
            this.f29489a.e().b().a(mm7.ERROR_CODE_VIEW_NOT_FOUND, str);
            return a(mm7.ERROR_CODE_VIEW_NOT_FOUND, str);
        }
    }

    public um7(LayoutInflater layoutInflater, Context context) {
        super(layoutInflater, context);
    }
}
