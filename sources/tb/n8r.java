package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ck;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n8r extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ID = 7700670404894374791L;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f24572a = "true".equals(y8r.g("renderWithCacheImage", "true"));

    public static /* synthetic */ Object ipc$super(n8r n8rVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1814733277) {
            return super.onCreateView((Context) objArr[0]);
        }
        if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/purchase/aura/dinamicx/widget/TBBuyImageWidgetNode");
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new n8r();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    public final boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0bdbc6", new Object[]{this, str})).booleanValue();
        }
        if ("88001".equals(str) || "88002".equals(str)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        String imageUrl = getImageUrl();
        if (f24572a) {
            z = t(imageUrl, view);
        }
        if (th.c() && z) {
            ck.g().e("缓存命中", ck.b.b().i("AURA/performance").a());
        }
        if (!z) {
            super.onRenderView(context, view);
        }
    }

    public final boolean t(String str, View view) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b55e9613", new Object[]{this, str, view})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || !m8r.h()) {
            return false;
        }
        Drawable j = m8r.j(str);
        boolean z = j != null && (view instanceof TUrlImageView);
        if (z) {
            TUrlImageView tUrlImageView = (TUrlImageView) view;
            tUrlImageView.setAutoRelease(false);
            tUrlImageView.enableSizeInLayoutParams(true);
            setLocalImage(tUrlImageView, j);
            setPlaceHolder(j);
        } else if (th.c() && !m8r.n(str)) {
            rbb g = ck.g();
            g.e("【下单小图】缓存未命中URL：" + str, ck.b.b().i("AURA/performance").a());
        }
        if (!u(getUserId())) {
            vm0.a a2 = vm0.a.a("smallPicturePreloadHit");
            if (z) {
                str2 = "命中缓存";
            } else {
                str2 = "未命中缓存";
            }
            vm0.d(a2.tag(str2).indicator("c1", m8r.g(str)).success(z).sampling(0.001f));
        }
        return z;
    }

    static {
        t2o.a(708837462);
    }
}
