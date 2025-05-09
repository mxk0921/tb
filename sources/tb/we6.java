package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import tb.idl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class we6 extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DXTBPrefetchImageViewWidget";

    static {
        t2o.a(614465716);
    }

    public static /* synthetic */ Object ipc$super(we6 we6Var, String str, Object... objArr) {
        if (str.hashCode() == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXTBPrefetchImageViewWidgetNode");
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new we6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        String str;
        DXTemplateItem p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (TextUtils.isEmpty(getImageUrl())) {
            super.onRenderView(context, view);
        } else {
            if (getDXRuntimeContext() == null || (p = getDXRuntimeContext().p()) == null) {
                str = "default";
            } else {
                str = p.f7343a;
            }
            t(context, str);
            super.onRenderView(context, view);
        }
    }

    public final void t(Context context, String str) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ebca8e", new Object[]{this, context, str});
            return;
        }
        Drawable j = qbv.j().o().j("orderList", dbv.BIZ_ORDER_LIST, getImageUrl());
        if (j != null) {
            setPlaceHolder(j);
            setLocalImageDrawable(j);
            if (context instanceof i4d) {
                ((i4d) context).v1();
            } else if (context instanceof FragmentActivity) {
                ISupportFragment h = qxq.h(((FragmentActivity) context).getSupportFragmentManager());
                if (h instanceof i4d) {
                    ((i4d) h).v1();
                }
            } else {
                hav.d(TAG, "context error");
            }
        } else {
            hav.d(TAG, "dxTemplateItemName: " + str + ", url: " + getImageUrl());
        }
        if (j == null) {
            z = false;
        }
        if (TextUtils.equals("orderlist_001", getImageBiztype())) {
            h15 success = idl.a.a(OrderBizCode.orderList, "firstScreenImgCacheHitRatio").success(z);
            if (z) {
                str2 = "hit cache!";
            } else {
                str2 = "cache miss!";
            }
            idl.c(success.message(str2).sampling(0.001f));
            hav.d(TAG, z + " - olist img load，imgUrl: " + getImageUrl());
        }
    }
}
