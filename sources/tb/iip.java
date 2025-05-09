package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class iip extends aip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f21333a;

    static {
        t2o.a(666894561);
    }

    public iip(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(iip iipVar, String str, Object... objArr) {
        if (str.hashCode() == -549999723) {
            return iipVar.a((View) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/normal/template/ShareCommonTemplate");
    }

    /* renamed from: c */
    public boolean d(a22 a22Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14859b9c", new Object[]{this, a22Var})).booleanValue();
        }
        return false;
    }

    public View e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.share_base_layout, (ViewGroup) null);
        this.f21333a = inflate;
        return inflate;
    }

    public Bitmap f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("92d46705", new Object[]{this});
        }
        return null;
    }

    public Bitmap g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("aaa87d19", new Object[]{this});
        }
        return a(this.f21333a);
    }
}
