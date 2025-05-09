package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.search.m3.M3CellBean;
import com.taobao.search.searchdoor.sf.config.TbSearchStyle;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ohb {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792479);
        }

        public static void a(ohb ohbVar, M3CellBean m3CellBean, boolean z, mfe mfeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d633a147", new Object[]{ohbVar, m3CellBean, new Boolean(z), mfeVar});
                return;
            }
            ckf.g(m3CellBean, "bean");
            ckf.g(mfeVar, DataReceiveMonitor.CB_LISTENER);
        }
    }

    void addDynamicCard(View view, boolean z);

    void addMoreButton(boolean z, boolean z2, M3CellBean m3CellBean, lsk lskVar, boolean z3);

    boolean canPlay();

    List<xfe> getDisplayIcons();

    void hideFeedback();

    void play();

    void removeDynamicCard();

    void stop();

    boolean updateComment(M3CellBean m3CellBean, boolean z);

    boolean updateComposite(M3CellBean m3CellBean, boolean z);

    void updateFeedback(M3CellBean m3CellBean, tqk tqkVar, TbSearchStyle tbSearchStyle, boolean z);

    boolean updateInteractiveTag(M3CellBean m3CellBean, eif eifVar, boolean z);

    boolean updateProperty(M3CellBean m3CellBean, boolean z);

    boolean updateSingleRow(M3CellBean m3CellBean, wuk wukVar, boolean z);

    boolean updateSummaryTips(M3CellBean m3CellBean, boolean z);

    void updateTitle(M3CellBean m3CellBean, TbSearchStyle tbSearchStyle);
}
