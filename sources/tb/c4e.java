package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.UltronProtocol;
import com.alibaba.android.umf.datamodel.service.parse.UMFParseIO;
import com.alibaba.android.umf.datamodel.service.render.UMFRenderIO;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.alibaba.android.umf.node.service.parse.state.tree.MultiTreeNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface c4e extends v3e, lbb {
    void A(UltronProtocol ultronProtocol, MultiTreeNode multiTreeNode);

    void B0(UMFRenderIO uMFRenderIO);

    void m(RenderComponent renderComponent);

    String q0();

    void z0(UMFParseIO uMFParseIO);
}
