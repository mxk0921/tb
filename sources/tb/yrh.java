package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yrh implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f32300a;
    public final String b;

    public yrh(Object obj, String str) {
        this.f32300a = obj;
        this.b = str;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String str;
        String str2;
        boolean equals = method.getName().equals("onSuccess");
        String str3 = this.b;
        if (equals) {
            rrh.e().k(str3);
        } else if (method.getName().equals("onFail")) {
            if (objArr == null || objArr.length < 2) {
                str = null;
                str2 = null;
            } else {
                str = (String) objArr[0];
                str2 = (String) objArr[1];
            }
            rrh.e().h(str3, str, str2);
        }
        return method.invoke(this.f32300a, objArr);
    }
}
