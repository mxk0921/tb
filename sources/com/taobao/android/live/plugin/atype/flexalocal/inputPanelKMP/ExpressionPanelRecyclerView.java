package com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.adapter.ExpressionPanelAdapter;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiStickerItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiTabItem;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import java.util.HashMap;
import tb.giv;
import tb.hw0;
import tb.k2c;
import tb.o3s;
import tb.t2o;
import tb.ux9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ExpressionPanelRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PORTRAIT_BOTTOM_MARGIN = 0;
    private static final float PORTRAIT_LEFT_RIGHT_MARGIN = -0.75f;
    private static final int PORTRAIT_TOP_MARGIN = 0;
    private static final String TAG = "ExpressionPanelRecyclerView";
    private ExpressionPanelAdapter mAdapter;
    private k2c mClickListener;
    private ux9 mFrameContext;

    static {
        t2o.a(295699449);
    }

    public ExpressionPanelRecyclerView(final Context context, ux9 ux9Var, k2c k2cVar) {
        super(context);
        this.mClickListener = k2cVar;
        this.mFrameContext = ux9Var;
        if (ux9Var.c) {
            setPadding(-hw0.b(context, 12.0f), 0, -hw0.b(context, 12.0f), 0);
        } else {
            setPadding(hw0.b(context, PORTRAIT_LEFT_RIGHT_MARGIN), 0, 0, 0);
        }
        addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.taobao.android.live.plugin.atype.flexalocal.inputPanelKMP.ExpressionPanelRecyclerView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r3, String str, Object... objArr) {
                if (str.hashCode() == -2066002230) {
                    super.getItemOffsets((Rect) objArr[0], (View) objArr[1], (RecyclerView) objArr[2], (RecyclerView.State) objArr[3]);
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/ExpressionPanelRecyclerView$1");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
                    return;
                }
                super.getItemOffsets(rect, view, recyclerView, state);
                if (recyclerView.getChildPosition(view) == ExpressionPanelRecyclerView.access$000(ExpressionPanelRecyclerView.this).getItemCount() - 1) {
                    rect.bottom = hw0.b(context, 74.0f);
                }
            }
        });
    }

    public static /* synthetic */ ExpressionPanelAdapter access$000(ExpressionPanelRecyclerView expressionPanelRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExpressionPanelAdapter) ipChange.ipc$dispatch("45c3a0ba", new Object[]{expressionPanelRecyclerView});
        }
        return expressionPanelRecyclerView.mAdapter;
    }

    public static /* synthetic */ Object ipc$super(ExpressionPanelRecyclerView expressionPanelRecyclerView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/inputPanelKMP/ExpressionPanelRecyclerView");
    }

    private void trackModuleShow(TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11bc7e3", new Object[]{this, taoLiveKtEmojiTabItem});
            return;
        }
        try {
            for (TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem : taoLiveKtEmojiTabItem.getStickerList()) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("module_name", taoLiveKtEmojiStickerItem.getType());
                hashMap.put("tab", ChatInputConstant.PANEL_ID_EMOJI);
                giv.f().p(this.mFrameContext, "Comment_EmoticonModel", hashMap);
            }
        } catch (Exception e) {
            o3s.d(TAG, "trackModuleShow catch exception:" + e.getMessage());
        }
    }

    public void refreshData(TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9316ad2", new Object[]{this, taoLiveKtEmojiTabItem});
            return;
        }
        ExpressionPanelAdapter expressionPanelAdapter = this.mAdapter;
        if (expressionPanelAdapter == null) {
            ExpressionPanelAdapter expressionPanelAdapter2 = new ExpressionPanelAdapter(getContext(), this.mFrameContext.c, this.mClickListener);
            this.mAdapter = expressionPanelAdapter2;
            expressionPanelAdapter2.M(taoLiveKtEmojiTabItem);
            setAdapter(this.mAdapter);
        } else {
            expressionPanelAdapter.M(taoLiveKtEmojiTabItem);
            this.mAdapter.notifyDataSetChanged();
        }
        trackModuleShow(taoLiveKtEmojiTabItem);
    }
}
