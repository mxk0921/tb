package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.publisher.service.export.ayscpublish.core.APublishTask;
import com.taobao.android.publisher.service.export.ayscpublish.core.PublishError;
import com.taobao.android.publisher.service.export.ayscpublish.core.a;
import com.taobao.android.publisher.service.export.ayscpublish.core.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class iyp implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc22699", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae2dba2", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d1c9f70", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0a81af", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void f(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c1227ac", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void g(a aVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78cea8bb", new Object[]{this, aVar, new Float(f)});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93fe9369", new Object[]{this, aVar});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public void i(a aVar, PublishError publishError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b58a1406", new Object[]{this, aVar, publishError});
        }
    }

    @Override // com.taobao.android.publisher.service.export.ayscpublish.core.b
    public /* synthetic */ void a(a aVar, APublishTask.b bVar) {
    }
}
