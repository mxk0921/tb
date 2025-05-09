package com.taobao.message.sp.category;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.chat.compat.tree.TreeQueryResult;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.PluginAdapter;
import com.taobao.message.lab.comfrm.inner2.config.LayoutInfo;
import com.taobao.message.lab.comfrm.inner2.config.SourceItem;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.support.list.AbsListWidgetInstance;
import com.taobao.message.sp.category.widget.NewCategoryPageInstance;
import com.taobao.message.tree.core.model.ContentNode;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.dgw;
import tb.mdd;
import tb.t2o;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessageTabLoadMonitorPlugin extends PluginAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "SimpleMsgTabLoadMonitorPlugin";
    private String apmPageSession;
    private Bundle args;
    private String bizConfigCode;
    private int firstSize = -1;
    private int lastSize = -1;
    private long lastRenderTime = 0;
    private boolean isAddSnapshotFlag = false;
    private boolean isAddViewTag = false;

    static {
        t2o.a(550502414);
    }

    public SimpleMessageTabLoadMonitorPlugin(Bundle bundle) {
        this.args = bundle;
        this.apmPageSession = bundle.getString("ampPageSession");
    }

    public static /* synthetic */ Object ipc$super(SimpleMessageTabLoadMonitorPlugin simpleMessageTabLoadMonitorPlugin, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1006013493:
                super.onSourceEnd((SourceItem) objArr[0], (Command) objArr[1], (Action) objArr[2]);
                return null;
            case -101811001:
                super.onContainerStartStart((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case 958399305:
                super.onSourceStart((SourceItem) objArr[0], (Command) objArr[1]);
                return null;
            case 1113031332:
                super.onRenderBefore((ViewObject) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/SimpleMessageTabLoadMonitorPlugin");
        }
    }

    private boolean isRecorder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ef29093", new Object[]{this})).booleanValue();
        }
        if (System.currentTimeMillis() - this.lastRenderTime <= 20000) {
            return true;
        }
        return false;
    }

    public boolean checkVO(ViewObject viewObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8e98bfb", new Object[]{this, viewObject})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onContainerStartStart(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ee7cc7", new Object[]{this, str, str2, str3});
            return;
        }
        super.onContainerStartStart(str, str2, str3);
        this.bizConfigCode = str2;
        mdd b = vxm.b.b(this.apmPageSession);
        if (b != null) {
            b.a("containerKey", str2);
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceEnd(SourceItem sourceItem, Command command, Action action) {
        List<ContentNode> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c40973cb", new Object[]{this, sourceItem, command, action});
            return;
        }
        super.onSourceEnd(sourceItem, command, action);
        if ("treeSource".equals(sourceItem.name) && TextUtils.equals(action.getName(), StdActions.UPDATE_ORIGINAL_DATA) && (action.getData() instanceof TreeQueryResult)) {
            TreeQueryResult treeQueryResult = (TreeQueryResult) action.getData();
            if (this.firstSize < 0 && (list = treeQueryResult.list) != null) {
                this.firstSize = list.size();
            }
            List<ContentNode> list2 = treeQueryResult.list;
            if (list2 != null) {
                this.lastSize = list2.size();
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onSourceStart(SourceItem sourceItem, Command command) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39200349", new Object[]{this, sourceItem, command});
            return;
        }
        super.onSourceStart(sourceItem, command);
        this.lastRenderTime = System.currentTimeMillis();
    }

    private void addViewTag(WidgetInstance widgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fd3966", new Object[]{this, widgetInstance});
            return;
        }
        TLog.loge(TAG, "addViewTag");
        ((NewCategoryPageInstance) widgetInstance).getView().setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        this.isAddViewTag = true;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderAfter(ViewObject viewObject, ViewGroup viewGroup, WidgetInstance widgetInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59558731", new Object[]{this, viewObject, viewGroup, widgetInstance});
            return;
        }
        try {
            if (isRecorder() && !this.isAddViewTag) {
                if (viewObject != null && viewObject.isSnapshot) {
                    Object obj = ((ViewObject) viewObject.children.get("content")).children.get("section");
                    if (obj instanceof List) {
                        List list = (List) obj;
                        if (list.size() > 0) {
                            Object obj2 = ((ViewObject) list.get(0)).children.get("content");
                            if (obj2 instanceof List) {
                                List list2 = (List) obj2;
                                if (list2 != null) {
                                    if (list2.size() < 5) {
                                    }
                                }
                                addViewTag(widgetInstance);
                            }
                        } else {
                            addViewTag(widgetInstance);
                        }
                    }
                }
                int i = this.lastSize;
                if (i != -1 && i < 5 && (widgetInstance instanceof NewCategoryPageInstance)) {
                    addViewTag(widgetInstance);
                }
                this.lastRenderTime = System.currentTimeMillis();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.PluginAdapter, com.taobao.message.lab.comfrm.inner2.Plugin
    public void onRenderBefore(ViewObject viewObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425782a4", new Object[]{this, viewObject});
            return;
        }
        super.onRenderBefore(viewObject);
        if (isRecorder()) {
            try {
                if (!this.isAddSnapshotFlag) {
                    mdd b = vxm.b.b(this.apmPageSession);
                    if (viewObject != null && b != null) {
                        b.a("snapshot", Boolean.valueOf(viewObject.isSnapshot));
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.bizConfigCode);
                        sb.append("_");
                        if (viewObject.isSnapshot) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        sb.append(str);
                        b.a("bizStage", sb.toString());
                        this.isAddSnapshotFlag = true;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public boolean checkView(WeakReference<Activity> weakReference) {
        TRecyclerView tRecyclerView;
        LayoutInfo layoutInfo;
        RenderTemplate renderTemplate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d339d4e", new Object[]{this, weakReference})).booleanValue();
        }
        Activity activity = weakReference.get();
        if (activity == null || (tRecyclerView = (TRecyclerView) activity.findViewById(R.id.viewCenterSectionList)) == null) {
            return false;
        }
        if (this.firstSize == 0) {
            return true;
        }
        if (tRecyclerView.getRawAdapter() != null && tRecyclerView.getRawAdapter().getItemCount() > 0 && tRecyclerView.getChildCount() > 0) {
            if (!(tRecyclerView.getRawAdapter() instanceof AbsListWidgetInstance.SectionAdapter)) {
                return true;
            }
            AbsListWidgetInstance.SectionAdapter sectionAdapter = (AbsListWidgetInstance.SectionAdapter) tRecyclerView.getRawAdapter();
            for (int i = 0; i < tRecyclerView.getItemCount(); i++) {
                ViewObject findViewObject = sectionAdapter.findViewObject(i);
                if (!(findViewObject == null || (layoutInfo = findViewObject.info) == null || (renderTemplate = layoutInfo.renderTemplate) == null || !TextUtils.equals(renderTemplate.name, "widget.message.common.itemwrapper"))) {
                    return true;
                }
            }
        }
        return false;
    }
}
