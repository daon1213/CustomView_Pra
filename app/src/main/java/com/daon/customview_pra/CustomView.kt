package com.daon.customview_pra

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.View

class CustomView(context:Context) : View(context) {
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.color = Color.BLACK
        paint.textSize = 100f

        canvas?.run {
            drawText("안녕하세요", 100f, 100f, paint)
            drawBlueCircle(canvas)
            drawGreenRect(canvas)
        }
    }

    fun drawBlueCircle(canvas: Canvas) {
        val paint = Paint()

        paint.style = Paint.Style.FILL
        paint.color = Color.BLUE

        canvas.drawCircle(150f, 300f, 100f, paint)
    }

    fun drawGreenRect(canvas: Canvas) {
        val paint = Paint()

        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 20f
        paint.color = Color.GREEN

        val rect = Rect(50, 450, 250, 650)

        canvas.drawRect(rect, paint)
    }
}