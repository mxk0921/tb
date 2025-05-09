package com.taobao.message.lab.comfrm.support.list;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.support.list.LongClickListenFrameLayout;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.component.unify.Dialog.TBSimpleListItem;
import com.taobao.uikit.extend.component.unify.Dialog.TBSimpleListItemType;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ListItemInstance extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LongClickListenFrameLayout wrapper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class MenuItem {
        public String title;
        public String type;

        static {
            t2o.a(537919827);
        }
    }

    static {
        t2o.a(537919824);
    }

    public static /* synthetic */ LongClickListenFrameLayout access$000(ListItemInstance listItemInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LongClickListenFrameLayout) ipChange.ipc$dispatch("9ef1a933", new Object[]{listItemInstance});
        }
        return listItemInstance.wrapper;
    }

    public static /* synthetic */ Object ipc$super(ListItemInstance listItemInstance, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/lab/comfrm/support/list/ListItemInstance");
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        LongClickListenFrameLayout longClickListenFrameLayout = new LongClickListenFrameLayout(context);
        this.wrapper = longClickListenFrameLayout;
        return longClickListenFrameLayout;
    }

    public void bindData(final JSONObject jSONObject, final EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        WidgetInstance createSlotWidgetIfNotExist = createSlotWidgetIfNotExist("content");
        if (createSlotWidgetIfNotExist != null) {
            if (this.wrapper.getChildCount() == 0 && createSlotWidgetIfNotExist.getView() != null) {
                this.wrapper.addView(createSlotWidgetIfNotExist.getView(), -1, -2);
            }
            bindSubViewData(createSlotWidgetIfNotExist, "content");
        }
        this.wrapper.setLongClickable(true);
        this.wrapper.setOnLongPressListener(new LongClickListenFrameLayout.OnLongPressListener() { // from class: com.taobao.message.lab.comfrm.support.list.ListItemInstance.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.support.list.LongClickListenFrameLayout.OnLongPressListener
            public void onLongPress(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9a2ff438", new Object[]{this, view, motionEvent});
                    return;
                }
                String string = jSONObject.getString("menu");
                if (!TextUtils.isEmpty(string)) {
                    final List parseArray = JSON.parseArray(string, MenuItem.class);
                    if (!parseArray.isEmpty()) {
                        TBSimpleListItem[] tBSimpleListItemArr = new TBSimpleListItem[parseArray.size()];
                        for (int i = 0; i < parseArray.size(); i++) {
                            tBSimpleListItemArr[i] = new TBSimpleListItem(((MenuItem) parseArray.get(i)).title, TBSimpleListItemType.NORMAL);
                        }
                        new TBMaterialDialog.Builder(ListItemInstance.access$000(ListItemInstance.this).getContext()).items(tBSimpleListItemArr).itemsCallback(new TBMaterialDialog.ListCallback() { // from class: com.taobao.message.lab.comfrm.support.list.ListItemInstance.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.ListCallback
                            public void onSelection(TBMaterialDialog tBMaterialDialog, View view2, int i2, TBSimpleListItem tBSimpleListItem) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("72c1a54f", new Object[]{this, tBMaterialDialog, view2, new Integer(i2), tBSimpleListItem});
                                    return;
                                }
                                MenuItem menuItem = (MenuItem) parseArray.get(i2);
                                eventDispatcher.dispatch(new Event.Build("typeClick" + menuItem.type).data(menuItem).build());
                                tBMaterialDialog.dismiss();
                            }
                        }).show();
                        eventDispatcher.dispatch(new Event.Build("swipeLeft").build());
                    }
                }
            }
        });
    }

    public void onDryRun(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d8d94e", new Object[]{this, context, jSONObject});
        } else {
            dryRunSlotWidget("content");
        }
    }
}
