package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ziq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ziq b = new ziq();

    /* renamed from: a  reason: collision with root package name */
    public String f32796a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
                return;
            }
            ziq.a(ziq.this, null);
            CheckHoldManager.i().n(2, null, null, false);
        }
    }

    static {
        t2o.a(479199252);
    }

    public ziq() {
        Localization.a(new a());
    }

    public static /* synthetic */ String a(ziq ziqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40583732", new Object[]{ziqVar, str});
        }
        ziqVar.f32796a = str;
        return str;
    }

    public static ziq c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ziq) ipChange.ipc$dispatch("4e043e6f", new Object[0]);
        }
        return b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79ee1b20", new Object[]{this});
        }
        return this.f32796a;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461304be", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f32796a = str;
        }
    }
}
