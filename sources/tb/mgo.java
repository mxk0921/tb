package tb;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mgo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24027a;

        public a(int i) {
            this.f24027a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/util/RoundCornerUtil$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f24027a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24028a;

        public b(int i) {
            this.f24028a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/util/RoundCornerUtil$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, -this.f24028a, view.getWidth(), view.getHeight(), this.f24028a);
            outline.offset(0, this.f24028a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24029a;

        public c(int i) {
            this.f24029a = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/util/RoundCornerUtil$3");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            int i = this.f24029a;
            outline.setRoundRect(0, 0, width, height + i, i);
            outline.offset(0, -this.f24029a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24030a;

        public d(int i) {
            this.f24030a = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/util/RoundCornerUtil$4");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(-this.f24030a, 0, view.getWidth(), view.getHeight(), this.f24030a);
            outline.offset(this.f24030a, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class e extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24031a;

        public e(int i) {
            this.f24031a = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/render/util/RoundCornerUtil$5");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth() + this.f24031a, view.getHeight(), this.f24031a);
            outline.offset(-this.f24031a, 0);
        }
    }

    static {
        t2o.a(336593055);
    }

    public static void a(ViewGroup viewGroup, float f, float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef5edc5a", new Object[]{viewGroup, new Float(f), new Float(f2), new Float(f3), new Float(f4)});
        } else if (Build.VERSION.SDK_INT >= 22) {
            int i = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            if (i == 0 && f == f3 && f3 == f4) {
                viewGroup.setOutlineProvider(new a((int) f));
                viewGroup.setClipToOutline(true);
            } else if (i == 0 && f3 == 0.0f && f4 == 0.0f) {
                viewGroup.setOutlineProvider(new b((int) f));
                viewGroup.setClipToOutline(true);
            } else if (f3 == f4 && f == 0.0f && f2 == 0.0f) {
                viewGroup.setOutlineProvider(new c((int) f3));
                viewGroup.setClipToOutline(true);
            } else if (f == f3 && f2 == 0.0f && f4 == 0.0f) {
                viewGroup.setOutlineProvider(new d((int) f));
                viewGroup.setClipToOutline(true);
            } else if (f2 == f4 && f == 0.0f && f3 == 0.0f) {
                viewGroup.setOutlineProvider(new e((int) f2));
                viewGroup.setClipToOutline(true);
            }
        }
    }
}
