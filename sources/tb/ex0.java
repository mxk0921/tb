package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ex0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Long> f18861a = new LruCache<>(10);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Long f18862a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Runnable e;
        public final /* synthetic */ List f;

        public a(Long l, String str, int i, int i2, Runnable runnable, List list) {
            this.f18862a = l;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = runnable;
            this.f = list;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/baobao/view/AnimUtils$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (this.f18862a.equals(ex0.a().get(this.b))) {
                int i = this.c;
                if (i == this.d) {
                    Runnable runnable = this.e;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                ((Animator) this.f.get(i + 1)).start();
            }
        }
    }

    public static /* synthetic */ LruCache a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("52229950", new Object[0]);
        }
        return f18861a;
    }

    public static Animator b(View view, int i, PropertyValuesHolder... propertyValuesHolderArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("fc125a7c", new Object[]{view, new Integer(i), propertyValuesHolderArr});
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(i);
        ofPropertyValuesHolder.setInterpolator(new AccelerateInterpolator());
        return ofPropertyValuesHolder;
    }

    public static void c(String str, List<Animator> list, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91335448", new Object[]{str, list, runnable});
            return;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        f18861a.put(str, valueOf);
        int size = list.size() - 1;
        for (int i = 0; i <= size; i++) {
            list.get(i).addListener(new a(valueOf, str, i, size, runnable, list));
        }
        list.get(0).start();
    }
}
