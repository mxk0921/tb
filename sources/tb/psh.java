package tb;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.pop.bean.MTBIconLocalIndexProtocol;
import com.taobao.mytaobao.pop.bean.MTBIconPixelInfoBean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class psh implements woc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745538015);
        t2o.a(745538014);
    }

    @Override // tb.woc
    public MTBIconLocalIndexProtocol a(String str) {
        MTBIconLocalIndexProtocol mTBIconLocalIndexProtocol;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconLocalIndexProtocol) ipChange.ipc$dispatch("835163b5", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            mTBIconLocalIndexProtocol = (MTBIconLocalIndexProtocol) JSON.parseObject(str, MTBIconLocalIndexProtocol.class);
        } catch (Exception unused) {
            mTBIconLocalIndexProtocol = null;
        }
        if (mTBIconLocalIndexProtocol == null || TextUtils.isEmpty(mTBIconLocalIndexProtocol.moduleTag)) {
            return null;
        }
        return mTBIconLocalIndexProtocol;
    }

    @Override // tb.woc
    public MTBIconPixelInfoBean b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MTBIconPixelInfoBean) ipChange.ipc$dispatch("fb8e1a20", new Object[]{this, view});
        }
        MTBIconPixelInfoBean mTBIconPixelInfoBean = new MTBIconPixelInfoBean();
        mTBIconPixelInfoBean.setFindIcon(true);
        mTBIconPixelInfoBean.setIconShow(true);
        e(view, mTBIconPixelInfoBean);
        d(view, mTBIconPixelInfoBean);
        c(mTBIconPixelInfoBean);
        return mTBIconPixelInfoBean;
    }

    public final void c(MTBIconPixelInfoBean mTBIconPixelInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c80d476", new Object[]{this, mTBIconPixelInfoBean});
            return;
        }
        mTBIconPixelInfoBean.setCenterX(mTBIconPixelInfoBean.getX() + (mTBIconPixelInfoBean.getIconWidth() / 2.0f));
        mTBIconPixelInfoBean.setCenterY(mTBIconPixelInfoBean.getY() + (mTBIconPixelInfoBean.getIconHeight() / 2.0f));
    }

    public final void d(View view, MTBIconPixelInfoBean mTBIconPixelInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef503f", new Object[]{this, view, mTBIconPixelInfoBean});
            return;
        }
        int height = view.getHeight();
        int width = view.getWidth();
        mTBIconPixelInfoBean.setIconHeight(height);
        mTBIconPixelInfoBean.setIconWidth(width);
    }

    public final void e(View view, MTBIconPixelInfoBean mTBIconPixelInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3eaef1a", new Object[]{this, view, mTBIconPixelInfoBean});
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        mTBIconPixelInfoBean.setX(iArr[0]);
        mTBIconPixelInfoBean.setY(iArr[1]);
    }
}
