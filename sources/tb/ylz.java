package tb;

import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iiz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ylz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ylz INSTANCE = new ylz();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32180a;

        public a(int i) {
            this.f32180a = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/RoundCornerUtil$setRadius$1");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f32180a);
            if (iiz.c()) {
                iiz.a aVar = iiz.Companion;
                aVar.j(">>> 裁剪圆角   width: " + view.getWidth() + " height ");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32181a;

        public b(int i) {
            this.f32181a = i;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/RoundCornerUtil$setRadius$2");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            outline.setRoundRect(0, -this.f32181a, view.getWidth(), view.getHeight(), this.f32181a);
            outline.offset(0, this.f32181a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32182a;

        public c(int i) {
            this.f32182a = i;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/RoundCornerUtil$setRadius$3");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            int width = view.getWidth();
            int height = view.getHeight();
            int i = this.f32182a;
            outline.setRoundRect(0, 0, width, height + i, i);
            outline.offset(0, -this.f32182a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32183a;

        public d(int i) {
            this.f32183a = i;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/RoundCornerUtil$setRadius$4");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            outline.setRoundRect(-this.f32183a, 0, view.getWidth(), view.getHeight(), this.f32183a);
            outline.offset(this.f32183a, 0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32184a;

        public e(int i) {
            this.f32184a = i;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/graphics/RoundCornerUtil$setRadius$5");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                return;
            }
            ckf.g(view, "view");
            ckf.g(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth() + this.f32184a, view.getHeight(), this.f32184a);
            outline.offset(-this.f32184a, 0);
        }
    }

    static {
        t2o.a(598737008);
    }

    public final void a(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90dc1c17", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ckf.g(view, "view");
        if (Build.VERSION.SDK_INT < 22) {
            return;
        }
        if (i == i2 && i == i3 && i3 == i4) {
            view.setOutlineProvider(new a(i));
            view.setClipToOutline(true);
        } else if (i == i2 && i3 == 0 && i4 == 0) {
            view.setOutlineProvider(new b(i));
            view.setClipToOutline(true);
        } else if (i3 == i4 && i == 0 && i2 == 0) {
            view.setOutlineProvider(new c(i3));
            view.setClipToOutline(true);
        } else if (i == i3 && i2 == 0 && i4 == 0) {
            view.setOutlineProvider(new d(i));
            view.setClipToOutline(true);
        } else if (i2 == i4 && i == 0 && i3 == 0) {
            view.setOutlineProvider(new e(i2));
            view.setClipToOutline(true);
        }
    }
}
