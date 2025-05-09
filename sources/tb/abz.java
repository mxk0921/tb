package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.runtime.node.MeasureAndLayoutDelegate;
import com.taobao.android.nanocompose.runtime.pipeline.parser.Parsing;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface abz {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(598737390);
        }

        public static void a(abz abzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ac2d57e", new Object[]{abzVar});
                return;
            }
            ckf.g(abzVar, "this");
            if (abzVar.getMeasureAndLayoutDelegate().e()) {
                abzVar.getMeasureAndLayoutDelegate().f();
            }
        }

        public static void b(abz abzVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74c87c57", new Object[]{abzVar});
                return;
            }
            ckf.g(abzVar, "this");
            abzVar.getMeasureAndLayoutDelegate().g();
        }

        public static void c(abz abzVar, Parsing parsing) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b8aea1b", new Object[]{abzVar, parsing});
                return;
            }
            ckf.g(abzVar, "this");
            ckf.g(parsing, "parsing");
            abzVar.getReParsingSet().add(parsing);
            abzVar.requestParse();
        }

        public static void d(abz abzVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6713237", new Object[]{abzVar, new Long(j)});
                return;
            }
            ckf.g(abzVar, "this");
            waz rootLayoutNode = abzVar.getRootLayoutNode();
            if (rootLayoutNode != null) {
                abzVar.getMeasureAndLayoutDelegate().o(rootLayoutNode);
            }
            abzVar.getMeasureAndLayoutDelegate().p(j);
        }
    }

    void forceMeasureTheSubtree(waz wazVar);

    MeasureAndLayoutDelegate getMeasureAndLayoutDelegate();

    Set<Parsing> getReParsingSet();

    e7z getRootFlattenedNode();

    waz getRootLayoutNode();

    void measureAndLayout();

    void measureOnly();

    void onRequestForceMeasureTheSubtree(waz wazVar);

    void onRequestMeasure(waz wazVar);

    void onRequestParse(Parsing parsing);

    void requestParse();

    /* renamed from: updateRootConstraints-W2SWlxA */
    void mo320updateRootConstraintsW2SWlxA(long j);

    void updateRootFlattenedNode(e7z e7zVar);

    void updateRootLayoutNode(waz wazVar);
}
