package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jbt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f21907a;
    public final String b;
    public Object c;
    public final dzd d;
    public final bf e;
    public final Map<String, Object> f;
    public azg g;

    static {
        t2o.a(806355760);
    }

    public jbt(Context context, String str, dzd dzdVar, bf bfVar, Map<String, Object> map) {
        this.f21907a = context;
        this.b = str;
        this.d = dzdVar;
        this.e = bfVar;
        this.f = map;
        a(str);
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c570f4", new Object[]{this, str});
        } else if (str.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.toString())) {
            this.g = new qnp();
        } else {
            this.g = new azg();
        }
    }

    public azg b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (azg) ipChange.ipc$dispatch("8be4909c", new Object[]{this});
        }
        return this.g;
    }
}
