package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.monitor.info.node.FileNode;
import com.taobao.tao.log.TLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ot2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f25631a = new ArrayList();
    public final List<a> b = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void d(File file, yve yveVar, long j);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void e(File file, yve yveVar);
    }

    static {
        t2o.a(737149050);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4be59c3", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.b).add(aVar);
        }
    }

    public void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adbebc7", new Object[]{this, bVar});
        } else {
            ((ArrayList) this.f25631a).add(bVar);
        }
    }

    public yve d(File file, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yve) ipChange.ipc$dispatch("6ce52a16", new Object[]{this, file, str});
        }
        TLog.loge(yr2.MODULE, "CacheVisitor", "walkFileTreeOld.start.rootFile=" + file.getAbsolutePath());
        FileNode fileNode = new FileNode(str, file);
        c(file, fileNode);
        TLog.loge(yr2.MODULE, "CacheVisitor", "walkFileTreeOld.end.rootFile=" + file.getAbsolutePath());
        return fileNode;
    }

    public void e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4004c26", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.b).remove(aVar);
        }
    }

    public void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a16ad16a", new Object[]{this, bVar});
        } else {
            ((ArrayList) this.f25631a).remove(bVar);
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        ((ArrayList) this.f25631a).clear();
        ((ArrayList) this.b).clear();
        super.finalize();
    }

    public long c(File file, yve yveVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5303c7d6", new Object[]{this, file, yveVar})).longValue();
        }
        if (file != null) {
            return g(file, yveVar, 0);
        }
        Log.e("CacheVisitor", "visit: rootFile is empty!");
        return 0L;
    }

    public final long g(File file, yve yveVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fed39b05", new Object[]{this, file, yveVar, new Integer(i)})).longValue();
        }
        long j = 0;
        if (file == null) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            for (File file2 : listFiles) {
                if (i > hg4.j().i().getMaxDeepLevel()) {
                    TLog.loge(yr2.MODULE, "CacheVisitor", "traversal: too deep, info node" + yveVar);
                    return j;
                }
                FileNode fileNode = new FileNode(yveVar, file2);
                j += g(file2, fileNode, i + 1);
                yveVar.addChild(fileNode);
            }
            yveVar.setSize(j);
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                ((a) it.next()).d(file, yveVar, j);
            }
            return j;
        }
        Iterator it2 = ((ArrayList) this.f25631a).iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).e(file, yveVar);
        }
        if (!hg4.j().i().getEnableSymbolicLink() || i >= hg4.j().i().getSoftLinkCheckMaxDepth() || !vs3.j(file)) {
            return file.length();
        }
        return 0L;
    }
}
