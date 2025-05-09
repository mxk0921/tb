package com.taobao.android.weex_uikit.widget.overlay;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeGroup;
import com.taobao.android.weex_uikit.ui.UINodeType;
import java.util.List;
import org.android.agoo.common.AgooConstants;
import tb.cxh;
import tb.dwh;
import tb.pg1;
import tb.t2o;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSOverlay extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "mus-overlay";
    private final ywh mNodeTree;
    private final UINodeGroup mRootNode;
    private final String KEY_TYPE = "type";
    private final String KEY_NODE_REF = "nodeRef";
    private final String KEY_POSITION = "position";
    private final String KEY_ANIMATION = "animation";
    private final String KEY_EXIT_ANIMATION = "exitAnimation";
    private final String KEY_ANIMATION_TYPE = "animationType";
    private final String KEY_MASK_ANIMATION = "maskAnimation";
    private final String KEY_MASK = "mask";
    private final String KEY_MASK_COLOR = "maskColor";
    private final String KEY_SHOW = "show";
    private final String KEY_Z_INDEX = pg1.ATOM_EXT_zIndex;
    private final String KEY_PULL_TO_CLOSE = "pullToClose";
    private final String EVENT_CLOSE = "close";
    private final String KEY_DISPLAY_MODE = "displayMode";

    static {
        t2o.a(986710191);
    }

    public MUSOverlay(int i, MUSDKInstance mUSDKInstance) {
        super(i);
        OverlayRootNode overlayRootNode = new OverlayRootNode(i, this);
        this.mRootNode = overlayRootNode;
        overlayRootNode.setParentNode(this);
        ywh ywhVar = new ywh();
        this.mNodeTree = ywhVar;
        ywhVar.e(overlayRootNode);
        ywhVar.j(false);
        setInstance(mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSOverlay mUSOverlay, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2062288793) {
            return super.findNodeById(((Number) objArr[0]).intValue());
        }
        if (hashCode == -2024255335) {
            super.onUpdateLayout(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == -1705119336) {
            super.setInstance((MUSDKInstance) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/weex_uikit/widget/overlay/MUSOverlay");
        }
    }

    private int parseMaskColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c805a1e8", new Object[]{this, str})).intValue();
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return cxh.c(str);
            }
            return -2009976270;
        } catch (Exception unused) {
            dwh.f(LOG_TAG, "value [\"" + str + "\"] not support for property \"maskColor\"");
            return -2009976270;
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a757e2c6", new Object[]{this, uINode});
        } else {
            this.mRootNode.addChild(uINode);
        }
    }

    @Override // tb.hvu
    public boolean canPreallocate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad6217b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void childrenChanged() {
        MUSOverlayView mUSOverlayView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacf51bc", new Object[]{this});
        } else if (((Integer) getAttribute("nodeRef")) != null && (mUSOverlayView = (MUSOverlayView) getMountContent()) != null) {
            mUSOverlayView.updateLocation();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void dispatchBatchTasks(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e1c906", new Object[]{this, list});
        } else {
            this.mRootNode.collectBatchTasks(list);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode findNodeById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("8513f867", new Object[]{this, new Integer(i)});
        }
        UINode findNodeById = super.findNodeById(i);
        if (findNodeById == null) {
            return this.mRootNode.findNodeById(i);
        }
        return findNodeById;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public UINode getChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINode) ipChange.ipc$dispatch("a88137b", new Object[]{this, new Integer(i)});
        }
        return this.mRootNode.getChildAt(i);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int getChildCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5991ad43", new Object[]{this})).intValue();
        }
        return this.mRootNode.getChildCount();
    }

    public ywh getChildNodeTree() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywh) ipChange.ipc$dispatch("b1357aaf", new Object[]{this});
        }
        return this.mNodeTree;
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public int indexOf(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bfeac2b", new Object[]{this, uINode})).intValue();
        }
        return this.mRootNode.indexOf(uINode);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void moveNode(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c07ca5a", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.mRootNode.moveNode(i, i2);
        }
    }

    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
        } else if (hasEvent("close")) {
            getInstance().fireEventOnNode(getNodeId(), "close", null);
        }
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new MUSOverlayView(context);
    }

    @Override // tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            ((MUSOverlayView) obj).unmount();
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void onUpdateLayout(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87585099", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onUpdateLayout(i, i2, i3, i4);
        getNodeInfo().X(0, 0, 0, 0);
        this.mRootNode.updateLayout(0, 0, i3 - i, i4 - i2);
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void removeChildAt(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d83acf1", new Object[]{this, new Integer(i)});
        } else {
            this.mRootNode.removeChildAt(i);
        }
    }

    @MUSNodeProp(name = "animation")
    public void setAnimation(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963fbfe4", new Object[]{this, bool});
        } else {
            setAttribute("animation", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "animation", refresh = true)
    public void setAnimationRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475d8b94", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setMusAnimation(z);
        }
    }

    @MUSNodeProp(name = "animationType")
    public void setAnimationType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9b3d2d", new Object[]{this, str});
        } else {
            setAttribute("animationType", str);
        }
    }

    @MUSNodeProp(name = "animationType", refresh = true)
    public void setAnimationTypeRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b6ecf0", new Object[]{this, str});
            return;
        }
        MUSOverlayView mUSOverlayView = (MUSOverlayView) getMountContent();
        if (str == null) {
            str = "opacity";
        }
        mUSOverlayView.setAnimationType(str);
    }

    @MUSNodeProp(name = "displayMode")
    public void setDisplayMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8150614", new Object[]{this, str});
        } else {
            setAttribute("displayMode", str);
        }
    }

    @MUSNodeProp(name = "exitAnimation")
    public void setExitAnimation(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b177422", new Object[]{this, bool});
        } else {
            setAttribute("exitAnimation", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "exitAnimation", refresh = true)
    public void setExitAnimationRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8c1216", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setMusExitAnimation(z);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode, com.taobao.android.weex_framework.ui.INode
    public void setInstance(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5df198", new Object[]{this, mUSDKInstance});
            return;
        }
        super.setInstance(mUSDKInstance);
        this.mRootNode.setInstance(mUSDKInstance);
        this.mNodeTree.d(mUSDKInstance.isPreciseExpose());
    }

    @MUSNodeProp(name = "mask")
    public void setMask(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dad4538", new Object[]{this, bool});
        } else {
            setAttribute("mask", bool);
        }
    }

    @MUSNodeProp(name = "maskAnimation")
    public void setMaskAnimation(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64009f0", new Object[]{this, bool});
        } else {
            setAttribute("maskAnimation", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "maskAnimation", refresh = true)
    public void setMaskAnimationRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47271108", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setMaskAnimation(z);
        }
    }

    @MUSNodeProp(name = "maskColor")
    public void setMaskColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a638a66", new Object[]{this, str});
        } else {
            setAttribute("maskColor", str);
        }
    }

    @MUSNodeProp(name = "maskColor", refresh = true)
    public void setMaskColorRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c90fd97", new Object[]{this, str});
        } else {
            ((MUSOverlayView) getMountContent()).setMaskColor(parseMaskColor(str));
        }
    }

    @MUSNodeProp(defaultBoolean = true, name = "mask", refresh = true)
    public void setMaskRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eae12c0", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setMask(z);
        }
    }

    @MUSNodeProp(name = "nodeRef")
    public void setNodeRef(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4affc83a", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            setAttribute("nodeRef", null);
        } else {
            setAttribute("nodeRef", jSONObject.getInteger("ref"));
        }
    }

    @MUSNodeProp(name = "nodeRef", refresh = true)
    public void setNodeRefRefresh(Integer num) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("176ada4", new Object[]{this, num});
            return;
        }
        MUSOverlayView mUSOverlayView = (MUSOverlayView) getMountContent();
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        mUSOverlayView.setNodeRef(Integer.valueOf(i));
    }

    @MUSNodeProp(name = "position")
    public void setPosition(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("974e8ffc", new Object[]{this, str});
        } else {
            setAttribute("position", str);
        }
    }

    @MUSNodeProp(name = "position", refresh = true)
    public void setPositionRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d516a341", new Object[]{this, str});
        } else {
            ((MUSOverlayView) getMountContent()).setPosition(str);
        }
    }

    @MUSNodeProp(defaultBoolean = false, name = "pullToClose")
    public void setPullToClose(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454e877", new Object[]{this, new Boolean(z)});
        } else {
            setAttribute("pullToClose", Boolean.valueOf(z));
        }
    }

    @MUSNodeProp(name = "show")
    public void setShow(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d66e07", new Object[]{this, bool});
        } else {
            setAttribute("show", bool);
        }
    }

    @MUSNodeProp(defaultBoolean = false, name = "show", refresh = true)
    public void setShowRefresh(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c65551", new Object[]{this, new Boolean(z)});
        } else {
            ((MUSOverlayView) getMountContent()).setShow(z);
        }
    }

    @MUSNodeProp(name = "type")
    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            setAttribute("type", str);
        }
    }

    @MUSNodeProp(name = "type", refresh = true)
    public void setTypeRefresh(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc3e1d0", new Object[]{this, str});
        } else {
            ((MUSOverlayView) getMountContent()).setType(str);
        }
    }

    @MUSNodeProp(name = pg1.ATOM_EXT_zIndex)
    public void setZIndex(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f3d8dd6", new Object[]{this, num});
        } else {
            setAttribute(pg1.ATOM_EXT_zIndex, num);
        }
    }

    @MUSNodeProp(name = pg1.ATOM_EXT_zIndex, refresh = true)
    public void setZIndexRefresh(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29be8f6f", new Object[]{this, num});
        } else {
            ((MUSOverlayView) getMountContent()).setZIndex(num);
        }
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public void addChild(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce9e9267", new Object[]{this, new Integer(i), uINode});
        } else {
            this.mRootNode.addChild(i, uINode);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        MUSOverlayView mUSOverlayView = (MUSOverlayView) obj;
        String str = (String) getAttribute("type");
        Integer num = (Integer) getAttribute("nodeRef");
        String str2 = (String) getAttribute("position");
        Boolean bool = (Boolean) getAttribute("animation");
        Boolean bool2 = (Boolean) getAttribute("exitAnimation");
        String str3 = (String) getAttribute("animationType");
        Boolean bool3 = (Boolean) getAttribute("maskAnimation");
        Boolean bool4 = (Boolean) getAttribute("mask");
        Boolean bool5 = (Boolean) getAttribute("show");
        Integer num2 = (Integer) getAttribute(pg1.ATOM_EXT_zIndex);
        Boolean bool6 = (Boolean) getAttribute("pullToClose");
        int parseMaskColor = parseMaskColor((String) getAttribute("maskColor"));
        String str4 = (String) getAttribute("displayMode");
        if (str == null) {
            str = "modal";
        }
        switch (str.hashCode()) {
            case -394109275:
                if (str.equals("popover")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 104069805:
                if (str.equals("modal")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 106852524:
                if (str.equals(AgooConstants.MESSAGE_POPUP)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (str2 == null) {
                    str2 = "topLeft";
                }
                break;
            case 1:
                str2 = "";
                break;
            case 2:
                if (str2 == null) {
                    str2 = "left";
                }
                break;
            default:
                str = "modal";
                str2 = "";
                break;
        }
        int intValue = num != null ? num.intValue() : -1;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : true;
        if (str3 == null) {
            str3 = "opacity";
        }
        mUSOverlayView.mount(this, str, intValue, str2, booleanValue, booleanValue2, str3, bool3 != null ? bool3.booleanValue() : true, bool4 != null ? bool4.booleanValue() : true, parseMaskColor, bool5 != null ? bool5.booleanValue() : false, num2, getNodeInfo().q(), bool6 != null && bool6.booleanValue(), str4);
    }
}
