local function beta_text(obj)
    local gameObject = CS.UnityEngine.GameObject.Find("UIRoot/AboveDialog/BetaHintDialog(Clone)")

    if gameObject then
        local textComponent = gameObject:GetComponentInChildren(typeof(CS.RPG.Client.LocalizedText))

        if textComponent then
            uid = textComponent.text;
            uid = uid:gsub("UID:", "<color=#ff99ff>半</color><color=#e899ff>夏</color><color=#d999ff>公</color><color=#c999ff>益</color><color=#ba99ff>服</color><color=#ab99ff>:</color>")
            textComponent.text = "<color=#FE969A>"..uid.."</color>"
            -- uidobj.text = "<color=#FE969A>"..uid.."</color>"        
        else
            -- log:write("No Text component found on the game object")
        end
    else
        -- log:write("Game object not found")
    end
end




local function version_text(obj)
    local gameObject = CS.UnityEngine.GameObject.Find("VersionText")

    if gameObject then
        local textComponent = gameObject:GetComponentInChildren(typeof(CS.RPG.Client.LocalizedText))

        if textComponent then
            uid = textComponent.text;
            uid = uid:gsub("UID:", "<color=#ff99ff>半</color><color=#e899ff>夏</color><color=#d999ff>公</color><color=#c999ff>益</color><color=#ba99ff>服</color><color=#ab99ff>:</color>")
            textComponent.text = "<color=#FE969A>"..uid.."</color>"
            -- uidobj.text = "<color=#FE969A>"..uid.."</color>"
        else
            log:write("No Text component found on the game object")
        end
    else
         log:write("Game object not found")
    end
end

local function mhy_text(obj)
    local gameObject = CS.UnityEngine.GameObject.Find("MHYText")

    if gameObject then
        local textComponent = gameObject:GetComponentInChildren(typeof(CS.RPG.Client.LocalizedText))

        if textComponent then
            textComponent.text = "GURALEAK"
            textComponent.visible = true
        else
            -- log:write("No Text component found on the game object")
        end
    else
        -- log:write("Game object not found")
    end
end

version_text()

mhy_text()
