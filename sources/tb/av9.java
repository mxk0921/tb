package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.newsetting.FontSetting;
import com.taobao.tao.Globals;
import java.util.HashMap;
import tb.px5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class av9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements px5.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f16025a;

        public a(av9 av9Var, Application application) {
            this.f16025a = application;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d95dfeb", new Object[]{this})).intValue();
            }
            return FontSetting.a(this.f16025a);
        }

        public double b(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("34c6553e", new Object[]{this, new Double(d)})).doubleValue();
            }
            return FontSetting.c(d);
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98dd3a23", new Object[]{this, new Integer(i)});
            } else {
                FontSetting.setFontCofficient(Globals.getApplication(), i, "DX_preview_page");
            }
        }
    }

    static {
        t2o.a(745537772);
    }

    public void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        application.getSharedPreferences("fontSetting", 0);
        px5.b().c(new a(this, application));
    }
}
