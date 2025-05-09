package com.taobao.taolive.room.ui.chat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ChatRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093240);
    }

    public ChatRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(ChatRecyclerView chatRecyclerView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/ui/chat/view/ChatRecyclerView");
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12db3b6f", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        stopNestedScroll();
        return super.onTouchEvent(motionEvent);
    }

    public ChatRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
