package tb;

import android.content.Context;
import android.view.View;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface g7c {
    void a(Context context, VideoInfo videoInfo, String str, Map<String, String> map, tjl tjlVar);

    void b(Context context, IPlayPublicService iPlayPublicService, VideoInfo videoInfo, boolean z, boolean z2, Map<String, String> map, tjl tjlVar);

    boolean c();

    boolean d();

    void destroy();

    void e(View.OnClickListener onClickListener);

    boolean f();

    View getView();
}
