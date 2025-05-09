package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tfw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f28695a;
    public DinamicTemplate b;
    public mm7 c;
    public final String d;
    public ArrayList<View> e;

    static {
        t2o.a(444596424);
    }

    public tfw(String str) {
        this.d = str;
    }

    public ArrayList<View> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1e3f5b1c", new Object[]{this});
        }
        return this.e;
    }

    public mm7 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mm7) ipChange.ipc$dispatch("bba2903f", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new mm7(this.d);
        }
        return this.c;
    }

    public DinamicTemplate c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicTemplate) ipChange.ipc$dispatch("7043cd26", new Object[]{this});
        }
        return this.b;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f28695a;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ce9ed7d", new Object[]{this})).booleanValue();
        }
        mm7 mm7Var = this.c;
        if (mm7Var == null || mm7Var.d()) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d6a38e", new Object[]{this})).booleanValue();
        }
        mm7 mm7Var = this.c;
        if (mm7Var == null || mm7Var.d()) {
            return true;
        }
        return false;
    }

    public void g(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82e551c", new Object[]{this, arrayList});
        } else {
            this.e = arrayList;
        }
    }

    public void h(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b210ff38", new Object[]{this, dinamicTemplate});
        } else {
            this.b = dinamicTemplate;
        }
    }

    public void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
        } else {
            this.f28695a = view;
        }
    }
}
