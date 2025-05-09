package com.taobao.android.live.plugin.atype.flexalocal.topbar.official;

import android.content.Context;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.List;
import tb.d9m;
import tb.gnk;
import tb.hw0;
import tb.ikr;
import tb.iwb;
import tb.k66;
import tb.ml6;
import tb.nh4;
import tb.sjr;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class OfficialLiveTopBarEntryFrame extends OfficialLiveEntryFrame {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_TEMPLATE_DEFAULT_URL = "https://dinamicx.alibabausercontent.com/pub/taolive_officiallive_entry_v2/1702624965993/taolive_officiallive_entry_v2.zip";
    private static final long DX_TEMPLATE_DEFAULT_VERSION = 3;
    private static final String DX_TEMPLATE_NAME = "taolive_officiallive_entry_v2";
    public static final String TAG = "OfficialLiveTopBarEntryFrame";
    private ViewGroup mAvatarLayout;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXTemplateItem f8719a;

        public a(DXTemplateItem dXTemplateItem) {
            this.f8719a = dXTemplateItem;
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            List<DXTemplateItem> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (k66Var != null && (list = k66Var.f22428a) != null && list.contains(this.f8719a)) {
                OfficialLiveTopBarEntryFrame.access$000(OfficialLiveTopBarEntryFrame.this);
                if (OfficialLiveTopBarEntryFrame.access$100(OfficialLiveTopBarEntryFrame.this) != null) {
                    OfficialLiveTopBarEntryFrame.this.renderDx();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this) != null && OfficialLiveTopBarEntryFrame.access$300(OfficialLiveTopBarEntryFrame.this) != null) {
                int measuredWidth = OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getMeasuredWidth();
                int measuredWidth2 = OfficialLiveTopBarEntryFrame.access$400(OfficialLiveTopBarEntryFrame.this).getMeasuredWidth();
                OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).measure(-2, -2);
                int measuredWidth3 = OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getMeasuredWidth();
                if (measuredWidth3 > measuredWidth2) {
                    DXRenderOptions.b bVar = new DXRenderOptions.b();
                    bVar.G(DXWidgetNode.DXMeasureSpec.c(measuredWidth3, 1073741824));
                    JSONObject jSONObject = (JSONObject) JSON.toJSON(OfficialLiveTopBarEntryFrame.access$500(OfficialLiveTopBarEntryFrame.this));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("officialLiveInfo");
                    if (jSONObject2 != null) {
                        jSONObject2.put("entryWidth", (Object) Integer.valueOf(measuredWidth3));
                        Context context = OfficialLiveTopBarEntryFrame.this.mContext;
                        if (context != null) {
                            jSONObject.put("nativeParams", NewStyleUtils.a(context, NewStyleUtils.NewStyleType.LARGE));
                        }
                        d9m.n().renderDX(OfficialLiveTopBarEntryFrame.access$600(OfficialLiveTopBarEntryFrame.this), jSONObject, bVar.q());
                    } else {
                        return;
                    }
                }
                if (measuredWidth3 < measuredWidth2) {
                    OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams().width = measuredWidth2;
                    OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).setLayoutParams(OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams());
                } else if (measuredWidth != measuredWidth3) {
                    OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams().width = measuredWidth3;
                    OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).setLayoutParams(OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams());
                }
                if (nh4.s0() && measuredWidth2 < hw0.a(56.0f)) {
                    OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams().width = -2;
                    OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).setLayoutParams(OfficialLiveTopBarEntryFrame.access$200(OfficialLiveTopBarEntryFrame.this).getLayoutParams());
                }
            }
        }
    }

    static {
        t2o.a(295700045);
        t2o.a(806355016);
    }

    public OfficialLiveTopBarEntryFrame(Context context, ux9 ux9Var) {
        super(context, ux9Var);
        createLocalIfNeed();
    }

    public static /* synthetic */ void access$000(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c00c0b7", new Object[]{officialLiveTopBarEntryFrame});
        } else {
            officialLiveTopBarEntryFrame.loadLocal();
        }
    }

    public static /* synthetic */ DXRootView access$100(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("cd758a9f", new Object[]{officialLiveTopBarEntryFrame});
        }
        return officialLiveTopBarEntryFrame.mDxRootView;
    }

    public static /* synthetic */ ViewGroup access$200(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4f2c223c", new Object[]{officialLiveTopBarEntryFrame});
        }
        return officialLiveTopBarEntryFrame.mAvatarLayout;
    }

    public static /* synthetic */ DXRootView access$300(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("e5eef55d", new Object[]{officialLiveTopBarEntryFrame});
        }
        return officialLiveTopBarEntryFrame.mDxRootView;
    }

    public static /* synthetic */ DXRootView access$400(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("722baabc", new Object[]{officialLiveTopBarEntryFrame});
        }
        return officialLiveTopBarEntryFrame.mDxRootView;
    }

    public static /* synthetic */ VideoInfo access$500(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("808908b9", new Object[]{officialLiveTopBarEntryFrame});
        }
        return officialLiveTopBarEntryFrame.mVideoInfo;
    }

    public static /* synthetic */ DXRootView access$600(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("8aa5157a", new Object[]{officialLiveTopBarEntryFrame});
        }
        return officialLiveTopBarEntryFrame.mDxRootView;
    }

    private void createLocalIfNeed() {
        DinamicXEngine e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7980789", new Object[]{this});
            return;
        }
        DXRootView createDX = d9m.n().createDX(this.mContext, DX_TEMPLATE_NAME);
        this.mDxRootView = createDX;
        if (createDX == null && (e = ikr.f().e()) != null) {
            DXTemplateItem dXTemplate = getDXTemplate();
            if (e.u(dXTemplate) == null) {
                e.j(new a(dXTemplate));
                ArrayList arrayList = new ArrayList();
                arrayList.add(dXTemplate);
                e.p(arrayList);
            }
        }
    }

    private DXTemplateItem getDXTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("1fc40614", new Object[]{this});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = DX_TEMPLATE_NAME;
        dXTemplateItem.b = 3L;
        dXTemplateItem.c = DX_TEMPLATE_DEFAULT_URL;
        return dXTemplateItem;
    }

    public static /* synthetic */ Object ipc$super(OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame, String str, Object... objArr) {
        if (str.hashCode() == -309961236) {
            super.onCleanUp();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/topbar/official/OfficialLiveTopBarEntryFrame");
    }

    private void loadLocal() {
        DXResult<DXRootView> o;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2f342c", new Object[]{this});
            return;
        }
        DXTemplateItem dXTemplate = getDXTemplate();
        if (ikr.f().e().u(dXTemplate) != null && (o = ikr.f().e().o(this.mContext, dXTemplate)) != null) {
            this.mDxRootView = o.f7291a;
        }
    }

    private void performHandleOfficialViewWidth() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db108f94", new Object[]{this});
        } else if (gnk.a().c(this.mFrameContext, this.mVideoInfo) && (viewGroup = this.mAvatarLayout) != null && this.mDxRootView != null) {
            viewGroup.post(new b());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame
    public void createDx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a0737", new Object[]{this});
            return;
        }
        DXRootView createDX = d9m.n().createDX(this.mContext, DX_TEMPLATE_NAME);
        this.mDxRootView = createDX;
        if (createDX == null) {
            loadLocal();
        }
        if (this.mDxRootView != null) {
            ikr.f().e().B0(this.mContext, this.mDxRootView.getDxTemplateItem(), this.mDxRootView.getData(), 0, null);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return TAG;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        ViewGroup viewGroup = this.mAvatarLayout;
        if (viewGroup != null) {
            viewGroup.getLayoutParams().width = -2;
            ViewGroup viewGroup2 = this.mAvatarLayout;
            viewGroup2.setLayoutParams(viewGroup2.getLayoutParams());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame
    public void renderDx() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b74c51", new Object[]{this});
            return;
        }
        inflateViewOnNeed();
        if (gnk.a().c(this.mFrameContext, this.mVideoInfo)) {
            createDx();
            if (this.mDxRootView != null) {
                sjr.g().a(this);
                JSONObject jSONObject = (JSONObject) JSON.toJSON(this.mVideoInfo);
                if (!(jSONObject == null || (context = this.mContext) == null)) {
                    jSONObject.put("nativeParams", NewStyleUtils.a(context, NewStyleUtils.NewStyleType.LARGE));
                }
                ikr.f().k(this.mDxRootView, jSONObject, ml6.a(this.mContext));
                ((ViewGroup) this.mContainer).removeAllViews();
                ((ViewGroup) this.mContainer).addView(this.mDxRootView);
                performHandleOfficialViewWidth();
            }
        }
    }

    public void setAvatarLayout(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439f81ab", new Object[]{this, viewGroup});
        } else {
            this.mAvatarLayout = viewGroup;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.officialLive.OfficialLiveEntryFrame
    public void updateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
        } else {
            renderDx();
        }
    }
}
