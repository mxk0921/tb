package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kvh extends yb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(578814155);
    }

    public static /* synthetic */ Object ipc$super(kvh kvhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/newsetting/MTbSettingsNavProcessorNodeComponentFilterItem0");
    }

    @Override // tb.yb4, tb.xb4
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f15c09d0", new Object[]{this, str})).booleanValue();
        }
        return str.equals("com.taobao.mytaobao.newsetting.NewTaobaoSettingActivity");
    }

    @Override // tb.yb4, tb.xb4
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e8cdc9e", new Object[]{this, str})).booleanValue();
        }
        return str.equals("com.taobao.taobao");
    }
}
