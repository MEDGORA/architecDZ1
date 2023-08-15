package InMemoryModel;

import java.util.List;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger  {

    public List<PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private IModelChangerObserver changerObserver;

    public ModelStore(List<PoligonalModel> Models, List<Scene> Scenes, List<Flash> Flashes, List<Camera> Cameras){
        this.Models = Models;
        this.Scenes = Scenes;
        this.Flashes = Flashes;
        this.Cameras = Cameras;
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NotifyChange'");
    }

    public Scene GetScena(int Id){
        return Scene;
    }

}