package tb;

import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.model.DrawerModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface d1c {
    void onDrawerCreate(DrawerModel drawerModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onDrawerDestroy(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onDrawerPause(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onDrawerResume(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onDrawerStart(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);

    void onDrawerStop(String str, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType);
}
