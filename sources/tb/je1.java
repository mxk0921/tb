package tb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class je1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f21946a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends LayoutInflater {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f21947a = {"android.widget.", "android.webkit.", "android.app."};

        static {
            t2o.a(301989901);
        }

        public a(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -424637217) {
                return super.onCreateView((String) objArr[0], (AttributeSet) objArr[1]);
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/asyncview/AsyncLayoutInflater$BasicInflater");
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LayoutInflater) ipChange.ipc$dispatch("9e726fa6", new Object[]{this, context});
            }
            return new a(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e6b08cdf", new Object[]{this, str, attributeSet});
            }
            for (String str2 : f21947a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
    }

    static {
        t2o.a(301989900);
    }

    public je1(Context context) {
        this.f21946a = context;
    }

    public void a(ArrayList<Integer> arrayList, boolean z, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fddc7a16", new Object[]{this, arrayList, new Boolean(z), bVar});
        } else if (this.f21946a != null) {
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                ((gf1) bVar).e(b(this.f21946a, next.intValue()), z, next.intValue());
            }
        }
    }

    public final View b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bbe50bcf", new Object[]{this, context, new Integer(i)});
        }
        try {
            return new a(new dew(context)).inflate(i, (ViewGroup) null, false);
        } catch (Throwable unused) {
            ck.g().e("Layout异步加载失败", ck.b.b().i("AURA/performance").a());
            return null;
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740cd63b", new Object[]{this, context});
        } else {
            this.f21946a = context;
        }
    }
}
