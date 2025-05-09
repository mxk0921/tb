package tb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.linkmanager.flowout.FlowOutCenter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class qa implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static c c;

    /* renamed from: a  reason: collision with root package name */
    public final Object f26614a;
    public final Context b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f26615a;
        public final /* synthetic */ Object[] b;

        public a(Method method, Object[] objArr) {
            this.f26615a = method;
            this.b = objArr;
        }

        @Override // tb.qa.b
        public void a(boolean z) {
            if (z) {
                try {
                    this.f26615a.invoke(qa.a(qa.this), this.b);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface c {
    }

    static {
        t2o.a(744488980);
    }

    public qa(Object obj, Context context) {
        this.f26614a = obj;
        this.b = context;
    }

    public static /* synthetic */ Object a(qa qaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("147a3c4d", new Object[]{qaVar});
        }
        return qaVar.f26614a;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        boolean equals = "startActivity".equals(method.getName());
        Object obj2 = this.f26614a;
        if (equals) {
            vp9.a("linkx", "ready to startActivity：" + method.getName());
            if (!b(objArr, new a(method, objArr))) {
                return 0;
            }
            try {
                return method.invoke(obj2, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        } else {
            try {
                return method.invoke(obj2, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getTargetException();
            }
        }
    }

    public final boolean b(Object[] objArr, b bVar) {
        String str;
        String str2;
        ActivityInfo activityInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac258e52", new Object[]{this, objArr, bVar})).booleanValue();
        }
        int i = 0;
        while (true) {
            try {
                if (i >= objArr.length) {
                    i = 0;
                    break;
                } else if (objArr[i] instanceof Intent) {
                    break;
                } else {
                    i++;
                }
            } catch (Exception e) {
                vp9.a("linkx", "AMSInvocationHandler === redirectIntent === 外跳拦截异常：" + e.toString());
            }
        }
        Intent intent = (Intent) objArr[i];
        if (intent != null) {
            if (intent.getComponent() != null) {
                str2 = intent.getComponent().getPackageName();
                str = intent.getComponent().getClassName();
            } else {
                ResolveInfo resolveActivity = this.b.getPackageManager().resolveActivity(intent, 0);
                if (resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null) {
                    str2 = "";
                    str = str2;
                } else {
                    String str3 = activityInfo.packageName;
                    str = activityInfo.name;
                    str2 = str3;
                }
            }
            vp9.a("linkx", "AMSInvocationHandler === packageName:" + str2 + "  componentName:" + str + "  intent:" + intent);
            if (TextUtils.equals(str2, "com.taobao.taobao")) {
                vp9.a("linkx", "AMSInvocationHandler === redirectIntent === 内部跳转调用！！！");
                return true;
            }
            c cVar = c;
            if (cVar != null) {
                return ((FlowOutCenter.a) cVar).a(intent, str2, str, this.b, bVar);
            }
        }
        return true;
    }
}
