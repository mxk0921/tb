package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lmg implements e8c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23414a;
    public final TBLiveDataModel b;
    public final ux9 c;

    static {
        t2o.a(779092961);
        t2o.a(806355033);
    }

    public lmg(Context context, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        this.f23414a = context;
        this.b = tBLiveDataModel;
        this.c = ux9Var;
    }

    @Override // tb.e8c
    public BaseFrame a(String str) {
        ux9 ux9Var = this.c;
        Class<? extends BaseFrame> b = mmg.b(str);
        if (b != null) {
            try {
                return (BaseFrame) b.getConstructor(Context.class, Boolean.TYPE, TBLiveDataModel.class, ux9.class).newInstance(this.f23414a, Boolean.valueOf(ux9Var.c), this.b, ux9Var);
            } catch (Exception e) {
                o3s.b("LegacyFrameFactory", "create error : " + e.getMessage());
                return null;
            }
        } else {
            o3s.b("LegacyFrameFactory", "请使用LegacyFrameRegistry.registerFrame注册组件");
            return null;
        }
    }
}
