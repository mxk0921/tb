package tb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.java_websocket.WebSocket;
import org.java_websocket.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public abstract class b40 extends j0x {
    private Timer connectionLostTimer;
    private TimerTask connectionLostTimerTask;
    private boolean reuseAddr;
    private boolean tcpNoDelay;
    private int connectionLostTimeout = 60;
    private boolean websocketRunning = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a extends TimerTask {

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<WebSocket> f16169a = new ArrayList<>();

        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f16169a.clear();
            try {
                this.f16169a.addAll(b40.this.getConnections());
                long currentTimeMillis = System.currentTimeMillis() - (b40.this.connectionLostTimeout * 1500);
                Iterator<WebSocket> it = this.f16169a.iterator();
                while (it.hasNext()) {
                    WebSocket next = it.next();
                    if (next instanceof b) {
                        b bVar = (b) next;
                        if (bVar.q() < currentTimeMillis) {
                            bVar.closeConnection(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
                        } else if (bVar.isOpen()) {
                            bVar.B();
                        }
                    }
                }
            } catch (Exception unused) {
            }
            this.f16169a.clear();
        }
    }

    private void cancelConnectionLostTimer() {
        Timer timer = this.connectionLostTimer;
        if (timer != null) {
            timer.cancel();
            this.connectionLostTimer = null;
        }
        TimerTask timerTask = this.connectionLostTimerTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.connectionLostTimerTask = null;
        }
    }

    private void restartConnectionLostTimer() {
        cancelConnectionLostTimer();
        this.connectionLostTimer = new Timer("WebSocketTimer");
        a aVar = new a();
        this.connectionLostTimerTask = aVar;
        Timer timer = this.connectionLostTimer;
        int i = this.connectionLostTimeout;
        timer.scheduleAtFixedRate(aVar, i * 1000, i * 1000);
    }

    public int getConnectionLostTimeout() {
        return this.connectionLostTimeout;
    }

    public abstract Collection<WebSocket> getConnections();

    public boolean isReuseAddr() {
        return this.reuseAddr;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public void setConnectionLostTimeout(int i) {
        this.connectionLostTimeout = i;
        if (i <= 0) {
            cancelConnectionLostTimer();
        } else if (this.websocketRunning) {
            try {
                Iterator it = new ArrayList(getConnections()).iterator();
                while (it.hasNext()) {
                    WebSocket webSocket = (WebSocket) it.next();
                    if (webSocket instanceof b) {
                        ((b) webSocket).F();
                    }
                }
            } catch (Exception unused) {
            }
            restartConnectionLostTimer();
        }
    }

    public void setReuseAddr(boolean z) {
        this.reuseAddr = z;
    }

    public void setTcpNoDelay(boolean z) {
        this.tcpNoDelay = z;
    }

    public void startConnectionLostTimer() {
        if (this.connectionLostTimeout > 0) {
            this.websocketRunning = true;
            restartConnectionLostTimer();
        }
    }

    public void stopConnectionLostTimer() {
        if (this.connectionLostTimer != null || this.connectionLostTimerTask != null) {
            this.websocketRunning = false;
            cancelConnectionLostTimer();
        }
    }
}
