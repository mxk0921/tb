package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliImageInterface;
import com.taobao.android.AliImageServiceInterface;
import tb.y06;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cp0 implements pwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements xp0<aq0> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y06.g f17215a;

        public a(cp0 cp0Var, y06.g gVar) {
            this.f17215a = gVar;
        }

        /* renamed from: b */
        public boolean a(aq0 aq0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("58f2cb53", new Object[]{this, aq0Var})).booleanValue();
            }
            ((y06.e) this.f17215a).a(aq0Var.getDrawable().getBitmap());
            return false;
        }
    }

    @Override // tb.pwb
    public void a(Context context, String str, y06.g gVar) {
        AliImageInterface a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36000f7e", new Object[]{this, context, str, gVar});
            return;
        }
        AliImageServiceInterface c = zp0.c();
        if (c != null && (a2 = c.a(context)) != null) {
            a2.load(str).succListener(new a(this, gVar)).a();
        }
    }
}
