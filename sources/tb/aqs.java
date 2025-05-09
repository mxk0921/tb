package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object baseFrame;
    public View frameView;
    @Deprecated
    public int index;
    public String key;
    public List<String> showTopBarType;
    public FrameLayout tabFrameLayout;
    public final VideoInfo.ExtraGoodsTabItem tabItem;
    public String tabType;
    public String title;
    public String url;
    public boolean anchorTab = false;
    public boolean showTab = true;

    static {
        t2o.a(295699162);
    }

    public aqs(int i, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        this.index = i;
        this.tabItem = extraGoodsTabItem;
        if (extraGoodsTabItem != null) {
            this.tabType = extraGoodsTabItem.type;
            this.key = createTabKey(extraGoodsTabItem);
            this.url = extraGoodsTabItem.url;
            this.title = extraGoodsTabItem.title;
            return;
        }
        this.key = null;
        this.tabType = null;
    }

    public static String createTabKey(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f653c11e", new Object[]{extraGoodsTabItem});
        }
        return extraGoodsTabItem.type + "_" + extraGoodsTabItem.title;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    public void onHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b4c13c8", new Object[]{this});
        }
    }

    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "   [title = " + this.title + ", key = " + this.key + ", tabType = " + this.tabType + ", url = " + this.url + ", anchorTab = " + this.anchorTab + ", showTab = " + this.showTab + ", ]";
    }
}
