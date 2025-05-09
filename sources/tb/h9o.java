package tb;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class h9o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f20484a;
        public final /* synthetic */ int b;

        public a(View view, int i) {
            this.f20484a = view;
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/ai/ResourceUtilKt$setCorner$2");
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
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f20484a.getResources().getDimensionPixelSize(this.b));
        }
    }

    static {
        t2o.a(815793061);
    }

    public static final int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a0975cc", new Object[]{new Integer(i)})).intValue();
        }
        return Globals.getApplication().getResources().getColor(i);
    }

    public static final int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14c7c6be", new Object[]{new Integer(i)})).intValue();
        }
        return Globals.getApplication().getResources().getDimensionPixelSize(i);
    }

    public static final void c(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e5ac3cf", new Object[]{view, new Integer(i)});
            return;
        }
        ckf.g(view, "<this>");
        view.setClipToOutline(true);
        view.setOutlineProvider(new a(view, i));
    }

    public static final String d(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a76b9fa", new Object[]{new Integer(i), objArr});
        }
        ckf.g(objArr, "args");
        String string = Globals.getApplication().getString(i, Arrays.copyOf(objArr, objArr.length));
        ckf.f(string, "getString(...)");
        return string;
    }
}
