package tb;

import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.model.TabModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface byd {
    void onTabCreate(TabModel tabModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onTabDestroy(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onTabPause(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onTabResume(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onTabStart(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onTabStop(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);
}
