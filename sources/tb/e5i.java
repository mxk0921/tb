package tb;

import com.alibaba.marvel.App;
import com.alibaba.marvel.Exporter;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.Viewer;
import com.alibaba.marvel.exporter.ImageExporter;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e5i implements uqc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final List<Project> b = new ArrayList();
    public final List<MeEditor> c = new ArrayList();
    public final List<Viewer> d = new ArrayList();
    public final List<Exporter> e = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final App f18294a = new App();

    static {
        t2o.a(511705475);
        t2o.a(511705474);
    }

    @Override // tb.uqc
    public synchronized void a(ImageExporter imageExporter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f18eeb4", new Object[]{this, imageExporter});
            return;
        }
        if (eag.F()) {
            imageExporter.destroy();
            ((ArrayList) this.e).remove(imageExporter);
        }
    }

    @Override // tb.uqc
    public synchronized MeEditor c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeEditor) ipChange.ipc$dispatch("4ee7e396", new Object[]{this});
        }
        if (((ArrayList) this.c).isEmpty()) {
            ((ArrayList) this.c).add(new MeEditor(this.f18294a));
        }
        odg.c("MarvelPool", "editor size = " + ((ArrayList) this.c).size());
        List<MeEditor> list = this.c;
        return (MeEditor) ((ArrayList) list).remove(((ArrayList) list).size() - 1);
    }

    @Override // tb.uqc
    public synchronized ImageExporter d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageExporter) ipChange.ipc$dispatch("f8357472", new Object[]{this});
        }
        ImageExporter imageExporter = new ImageExporter();
        ((ArrayList) this.e).add(imageExporter);
        return imageExporter;
    }

    @Override // tb.uqc
    public synchronized void e(MeEditor meEditor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd633a26", new Object[]{this, meEditor});
            return;
        }
        if (!((ArrayList) this.c).contains(meEditor)) {
            ((ArrayList) this.c).add(meEditor);
        }
    }

    @Override // tb.uqc
    public synchronized void f(Viewer viewer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e02b594", new Object[]{this, viewer});
            return;
        }
        if (!((ArrayList) this.d).contains(viewer)) {
            ((ArrayList) this.d).add(viewer);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        odg.b(RPCDataItems.SWITCH_TAG_LOG, "aYou thumbnailL focus onDestroy, marvelPool, mEditorPoolList.s=" + ((ArrayList) this.c).size() + " ，mViewerPoolList.s=" + ((ArrayList) this.d).size() + " ,mProjectPoolList.s=" + ((ArrayList) this.b).size());
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((MeEditor) it.next()).getCoreEditor().destroy();
        }
        Iterator it2 = ((ArrayList) this.d).iterator();
        while (it2.hasNext()) {
            ((Viewer) it2.next()).destroy();
        }
        if (eag.F()) {
            ListIterator listIterator = ((ArrayList) this.e).listIterator();
            while (listIterator.hasNext()) {
                ((Exporter) listIterator.next()).destroy();
            }
        }
        Iterator it3 = ((ArrayList) this.b).iterator();
        while (it3.hasNext()) {
            ((Project) it3.next()).destroy();
        }
        this.f18294a.destroy();
    }

    @Override // tb.uqc
    public synchronized Project b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Project) ipChange.ipc$dispatch("69aa7be0", new Object[]{this});
        }
        Project project = new Project(this.f18294a);
        ((ArrayList) this.b).add(project);
        odg.c("MarvelPool", "project size = " + ((ArrayList) this.b).size());
        return project;
    }

    @Override // tb.uqc
    public synchronized Viewer g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Viewer) ipChange.ipc$dispatch("7c54f22e", new Object[]{this});
        }
        if (((ArrayList) this.d).isEmpty()) {
            ((ArrayList) this.d).add(new Viewer(this.f18294a));
        }
        odg.c("MarvelPool", "view size = " + ((ArrayList) this.d).size());
        List<Viewer> list = this.d;
        return (Viewer) ((ArrayList) list).remove(((ArrayList) list).size() - 1);
    }
}
