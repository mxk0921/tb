package tb;

import com.alibaba.ut.abtest.bucketing.expression.Expression;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vr8 implements ur8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final mq8 f30198a = new mq8();

    static {
        t2o.a(961544281);
        t2o.a(961544280);
    }

    @Override // tb.ur8
    public boolean a(Expression expression, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c8c0b02", new Object[]{this, expression, new Long(j), new Long(j2)})).booleanValue();
        }
        if (expression == null || this.f30198a.d(expression, null, j, j2, true)) {
            return true;
        }
        return false;
    }

    @Override // tb.ur8
    public boolean b(Expression expression, Map<String, Object> map, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ab92413", new Object[]{this, expression, map, new Long(j), new Long(j2)})).booleanValue();
        }
        if (expression == null || this.f30198a.d(expression, map, j, j2, false)) {
            return true;
        }
        return false;
    }
}
